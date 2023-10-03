package com.demo.jpa.joins.controller;

import com.demo.jpa.joins.model.Category;
import com.demo.jpa.joins.model.Order;
//import jakarta.validation.constraints.Min;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@Validated
public class OrderController {

	@GetMapping("/{id}")
	public Order getOrder(@PathVariable Long id) {
		return null;
	}

	@PostMapping("/createCategory")
	public List<Category> saveAndGetAllCategories(@RequestBody Category category){

		return null;
	}

}
