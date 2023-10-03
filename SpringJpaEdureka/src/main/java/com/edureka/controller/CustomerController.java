package com.edureka.controller;

import com.edureka.model.Customer;
import com.edureka.model.Product;
import com.edureka.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository repository;

    @PostMapping("/createCustomer")
    public List<Customer> saveAndGetAllProducts(@RequestBody Customer customer){
        System.out.println("received product as "+customer);
        repository.save(customer);
        return repository.findAll();
    }
}
