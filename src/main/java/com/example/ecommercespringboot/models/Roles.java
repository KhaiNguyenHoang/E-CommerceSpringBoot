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

import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@Table(name = "roles")
public class Roles implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private String id = "newid()";

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private String createdAt = "getdate()";

    @Column(name = "updated_at")
    private String updatedAt = "getdate()";

}
