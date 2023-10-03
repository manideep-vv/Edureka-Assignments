package com.demo.jpa.joins.controller;

import com.demo.jpa.joins.model.Product;
import com.demo.jpa.joins.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
//@Validated
public class ProductController {

    @Autowired
    ProductRepository repository;


    @PostConstruct
    public void init(){
        System.out.println(ProductController.class +" object has been created  ");
    }
    @PostMapping("/createProduct")
    public List<Product> saveAndGetAllProducts(@RequestBody Product product){
        System.out.println("received product as "+product);
        repository.save(product);
        return repository.findAll();
    }
}
