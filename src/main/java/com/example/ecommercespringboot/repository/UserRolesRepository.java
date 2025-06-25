package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRolesRepository extends JpaRepository<UserRoles, String>, JpaSpecificationExecutor<UserRoles> {

}