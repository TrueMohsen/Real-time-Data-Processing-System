package com.example.tapsell3.controllers;

import com.example.tapsell3.entities.Customer;
import com.example.tapsell3.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {


    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Long id){
        customerRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Customer getICustomer(@PathVariable("id") Long id){
        return customerRepository.getById(id);
    }
}
