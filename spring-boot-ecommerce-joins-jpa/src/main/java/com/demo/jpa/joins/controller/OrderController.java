package com.demo.jpa.joins.controller;

import com.demo.jpa.joins.model.Category;
import com.demo.jpa.joins.model.Product;
import jakarta.validation.constraints.Min;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.demo.jpa.joins.model.Order;

import java.util.List;

@RestController
@Validated
public class OrderController {

	@GetMapping("/{id}")
	public Order getOrder(@PathVariable @Min(1) Long id) {
		return null;
	}

	@PostMapping("/createCategory")
	public List<Category> saveAndGetAllCategories(@RequestBody Category category){

		return null;
	}

}
