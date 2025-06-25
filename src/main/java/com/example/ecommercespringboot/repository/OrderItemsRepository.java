package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderItemsRepository extends JpaRepository<OrderItems, String>, JpaSpecificationExecutor<OrderItems> {

}