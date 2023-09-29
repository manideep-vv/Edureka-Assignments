package com.demo.jpa.joins.repositories;

import com.demo.jpa.joins.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Long, Product> {
}
