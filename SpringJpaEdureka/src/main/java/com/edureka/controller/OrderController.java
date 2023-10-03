package com.edureka.controller;

import com.edureka.model.Customer;
import com.edureka.model.Order;
import com.edureka.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderRepository repository;

    @PostMapping("/createOrder")
    public List<Order> saveAndGetAllProducts(@RequestBody Order  order){
        System.out.println("received order as "+ order);
        repository.save( order);
        return repository.findAll();
    }
}
