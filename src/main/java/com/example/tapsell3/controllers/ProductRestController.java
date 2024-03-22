package com.example.tapsell3.controllers;

import com.example.tapsell3.entities.Product;
import com.example.tapsell3.repositories.ProductRepository;
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
    public void deleteProduct(@PathVariable("id") Long id){
        productRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id){
        return productRepository.getById(id);
    }
}
