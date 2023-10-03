package com.edureka.controller;

import com.edureka.model.Product;
import com.edureka.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@RestController
//@Validated
@Validated
//Tested
public class ProductController {

    @Autowired
    ProductRepository repository;


    @PostConstruct
    public void init() {
        System.out.println(ProductController.class + " object has been created  ");
    }

    @PostMapping("/createProduct")
    public List<Product> saveAndGetAllProducts(@RequestBody Product product) {
        System.out.println("received product as " + product);
        repository.save(product);
        return repository.findAll();
    }

    @GetMapping("/getAllProducts")
    public List<Product> GetAllProducts() {
        return repository.findAll();
    }

    @PutMapping("/updateProduct")
    public List<Product> updateProductNameAndPrice(@RequestBody Product product) {
        Optional<Product> existing = repository.findById(product.getId());
        if (existing.isPresent()) {
            System.out.println("product is already present modifying the prod name and price");
            Product existingProduct = existing.get();
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            repository.save(existingProduct);
        } else {
            repository.save(product);
        }
        return repository.findAll();
    }

    @DeleteMapping("/deleteProduct")
    public List<Product> deleteProduct(@RequestBody Product product) {
        repository.deleteById(product.getId());
        System.out.println("deleting a product with id " + product.getId());
        return repository.findAll();
    }
}
