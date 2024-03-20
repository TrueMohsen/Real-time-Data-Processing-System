package com.example.tapsell.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productID;
    private String name;
    private Double price;
    private Integer stockQuantity;
    private String description;
    private String category;

    private String cautomerID;


}
