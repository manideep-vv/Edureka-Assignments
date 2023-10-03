package com.edureka.repository;

import com.edureka.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Customer, Long> {
}
