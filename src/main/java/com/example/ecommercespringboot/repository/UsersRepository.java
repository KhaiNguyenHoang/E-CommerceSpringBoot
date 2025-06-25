package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UsersRepository extends JpaRepository<Users, String>, JpaSpecificationExecutor<Users> {

}