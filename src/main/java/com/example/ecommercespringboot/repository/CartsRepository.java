package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.Carts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CartsRepository extends JpaRepository<Carts, String>, JpaSpecificationExecutor<Carts> {

}