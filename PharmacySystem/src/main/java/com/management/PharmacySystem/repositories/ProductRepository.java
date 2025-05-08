package com.management.PharmacySystem.repositories;

import com.management.PharmacySystem.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
