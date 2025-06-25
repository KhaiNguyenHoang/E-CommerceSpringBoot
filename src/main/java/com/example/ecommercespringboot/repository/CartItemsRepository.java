package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.CartItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CartItemsRepository extends JpaRepository<CartItems, String>, JpaSpecificationExecutor<CartItems> {

}