package com.example.ecommercespringboot.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@IdClass(UserRolesId.class)
@Table(name = "user_roles")
public class UserRoles implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;

    @Id
    @Column(name = "role_id", nullable = false)
    private String roleId;

    @Column(name = "assigned_at")
    private String assignedAt = "getdate()";

}
