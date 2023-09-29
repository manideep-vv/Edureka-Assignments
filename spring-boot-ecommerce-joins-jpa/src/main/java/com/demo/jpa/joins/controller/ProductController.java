package com.demo.jpa.joins.controller;

import com.demo.jpa.joins.model.Product;
import com.demo.jpa.joins.repositories.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class ProductController {

    @Autowired
    ProductRepository repository;


    @PostConstruct
    public void init(){
        System.out.println(ProductController.class +" object has been created  ");
    }
    @PostMapping("/createProduct")
    public List<Product> saveAndGetAllProducts(@RequestBody Product product){

        return null;
    }
}
