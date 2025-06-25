package com.example.ecommercespringboot.repository;

import com.example.ecommercespringboot.models.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AddressesRepository extends JpaRepository<Addresses, String>, JpaSpecificationExecutor<Addresses> {

}