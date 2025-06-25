package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoriesRepository extends JpaRepository<Categories, String>, JpaSpecificationExecutor<Categories> {

}