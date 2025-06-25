package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RolesRepository extends JpaRepository<Roles, String>, JpaSpecificationExecutor<Roles> {

}