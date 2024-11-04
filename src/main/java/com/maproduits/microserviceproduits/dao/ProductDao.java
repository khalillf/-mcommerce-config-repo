package com.maproduits.microserviceproduits.dao;

import com.maproduits.microserviceproduits.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
}