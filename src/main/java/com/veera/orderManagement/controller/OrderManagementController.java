package com.veera.orderManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.veera.orderManagement.model.Order;
import com.veera.orderManagement.service.OrderManagementService;


@RestController
public class OrderManagementController {

	@Autowired
	OrderManagementService orderManagementService;
	
	
	@GetMapping("/getAllOrders")
	public List<Order> getAllOrders() {
		return orderManagementService.getAllOrders();
	}
	
	@GetMapping("/getOrderDetails/{orderId}")
	public Order getOrderDetails(@PathVariable Integer orderId) {
		return orderManagementService.getByOrderId(orderId);
	}
	
	
	@PostMapping("/insert")
	public ResponseEntity<String> insertOrders(@RequestBody Order order) {	
		orderManagementService.insertOrder(order);
		
		return new ResponseEntity<>("Inserted", HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateOrders(@RequestBody Order order) {
		orderManagementService.updateOrders(order);
		return new ResponseEntity<>("Updated", HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteOrder(@RequestParam Integer orderId)
	{
		orderManagementService.deleteOrder(orderId);
		return new ResponseEntity<>("Deleted", HttpStatus.OK);
	}
	
	
	
}
