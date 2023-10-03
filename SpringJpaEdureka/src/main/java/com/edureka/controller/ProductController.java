package com.edureka.controller;

import com.edureka.model.Product;
import com.edureka.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
//@Validated
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
        System.out.println("received product as "+product);
        repository.save(product);
        return repository.findAll();
    }
}
