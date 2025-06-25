package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.ProductReviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductReviewsRepository extends JpaRepository<ProductReviews, String>, JpaSpecificationExecutor<ProductReviews> {

}