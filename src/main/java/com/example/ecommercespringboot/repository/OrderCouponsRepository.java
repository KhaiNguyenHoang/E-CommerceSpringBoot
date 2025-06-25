package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.OrderCoupons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderCouponsRepository extends JpaRepository<OrderCoupons, String>, JpaSpecificationExecutor<OrderCoupons> {

}