package com.example.ecommercespringboot.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Value("${spring.security.oauth2.resourceserver.jwt.issuer-uri}")
    private String issuerUri;

    @Value("${spring.security.oauth2.client.provider.google.authorization-uri}")
    private String googleAuthorizationUri;

    @Value("${spring.security.oauth2.client.registration.google.redirect-uri}")
    private String googleRedirectUri;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, UserDetailsService userDetailsService) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable) // Disable CSRF for stateless API endpoints
                .sessionManagement(session -> session
                        .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)) // Allow session for form login
                .authorizeHttpRequests(auth -> auth
                        // Public endpoints
                        .requestMatchers("/api/public/**", "/login", "/api/auth/register").permitAll()
                        // User-specific endpoints
                        .requestMatchers("/api/products/**", "/api/cart/**", "/api/orders/**").hasAnyRole("USER", "ADMIN")
                        // Admin-specific endpoints
                        .requestMatchers("/api/admin/**").hasRole("ADMIN")
                        // All other requests require authentication
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .defaultSuccessUrl("/api/home", true)
                        .permitAll()
                )
                .oauth2Login(oauth2 -> oauth2
                        .loginPage("/login")
                        .userInfoEndpoint(userInfo -> userInfo
                                .oidcUserService(oidcUserService())
                        )
                        .authorizationEndpoint(auth -> auth
                                .baseUri("/oauth2/authorization")
                        )
                        .redirectionEndpoint(redirection -> redirection
                                .baseUri("/login/oauth2/code/*")
                        )
                        .defaultSuccessUrl("/api/home", true)
                )
                .oauth2ResourceServer(oauth2 -> oauth2
                        .jwt(jwt -> jwt
                                .decoder(jwtDecoder())
                                .jwtAuthenticationConverter(jwtAuthenticationConverter())
                        )
                )
                .build();
    }

    @Bean
    public JwtDecoder jwtDecoder() {
        // Use NimbusJwtDecoder for OAuth2 JWT validation
        return NimbusJwtDecoder
                .withJwkSetUri(issuerUri + "/protocol/openid-connect/certs")
                .build();
    }

    @Bean
    public JwtAuthenticationConverter jwtAuthenticationConverter() {
        // Configure JWT to extract roles from the "roles" claim
        JwtGrantedAuthoritiesConverter grantedAuthoritiesConverter = new JwtGrantedAuthoritiesConverter();
        grantedAuthoritiesConverter.setAuthoritiesClaimName("roles");
        grantedAuthoritiesConverter.setAuthorityPrefix("ROLE_");

        JwtAuthenticationConverter converter = new JwtAuthenticationConverter();
        converter.setJwtGrantedAuthoritiesConverter(grantedAuthoritiesConverter);
        return converter;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public OidcUserService oidcUserService() {
        return new OidcUserService();
    }

    // Example UserDetailsService (customize based on your user repository)
    @Bean
    public UserDetailsService userDetailsService(BCryptPasswordEncoder passwordEncoder) {
        // In-memory user for demonstration; replace with your repository-based implementation
        return username -> {
            if ("user".equals(username)) {
                return org.springframework.security.core.userdetails.User
                        .withUsername("user")
                        .password(passwordEncoder.encode("password"))
                        .roles("USER")
                        .build();
            } else if ("admin".equals(username)) {
                return org.springframework.security.core.userdetails.User
                        .withUsername("admin")
                        .password(passwordEncoder.encode("admin"))
                        .roles("ADMIN")
                        .build();
            }
            throw new UsernameNotFoundException("User not found: " + username);
        };
    }
}