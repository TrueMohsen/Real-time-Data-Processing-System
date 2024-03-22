package com.example.tapsell3.repositories;

import com.example.tapsell3.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
