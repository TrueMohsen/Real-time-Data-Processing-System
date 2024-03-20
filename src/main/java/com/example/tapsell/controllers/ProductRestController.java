package com.example.tapsell.controllers;

import com.example.tapsell.entities.Customer;
import com.example.tapsell.entities.Product;
import com.example.tapsell.repositories.CustomerRepository;
import com.example.tapsell.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") String id){
        productRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") String id){
        return productRepository.getById(id);
    }
}
