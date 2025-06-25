package com.example.ecommercespringboot.configuration;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserCustomerDetail implements UserDetails {
    private final String username;
    private final String password;
    private final List<GrantedAuthority> authorities;
    private final String email;
    private final String fullName;
    private final boolean isAccountNonExpired;
    private final boolean isAccountNonLocked;
    private final boolean isCredentialsNonExpired;
    private final boolean isEnabled;

    public UserCustomerDetail(String username, String password, List<String> roles,
                              String email, String fullName, boolean isEnabled) {
        this.username = username;
        this.password = password;
        this.authorities = roles.stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_" + role))
                .collect(Collectors.toList());
        this.email = email;
        this.fullName = fullName;
        this.isAccountNonExpired = true;
        this.isAccountNonLocked = true;
        this.isCredentialsNonExpired = true;
        this.isEnabled = isEnabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }
}