package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.Tokens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TokensRepository extends JpaRepository<Tokens, String>, JpaSpecificationExecutor<Tokens> {

}