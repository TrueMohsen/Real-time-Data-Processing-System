package com.example.tapsell3.repositories;

import com.example.tapsell3.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
