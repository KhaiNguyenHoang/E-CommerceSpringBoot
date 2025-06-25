package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.ProductImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductImagesRepository extends JpaRepository<ProductImages, String>, JpaSpecificationExecutor<ProductImages> {

}