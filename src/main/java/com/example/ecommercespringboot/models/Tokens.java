package com.example.ecommercespringboot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "tokens")
public class Tokens implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private String id = "newid()";

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "token", nullable = false)
    private String token;

    @Column(name = "token_type", nullable = false)
    private String tokenType;

    @Column(name = "is_revoked")
    private Boolean revoked = Boolean.FALSE;

    @Column(name = "created_at")
    private String createdAt = "getdate()";

    @Column(name = "expires_at")
    private String expiresAt;

}
