package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductsRepository extends JpaRepository<Products, String>, JpaSpecificationExecutor<Products> {

}