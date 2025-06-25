package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.Coupons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CouponsRepository extends JpaRepository<Coupons, String>, JpaSpecificationExecutor<Coupons> {

}