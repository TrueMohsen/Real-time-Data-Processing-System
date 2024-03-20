package com.example.tapsell.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String customerID;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;


}
