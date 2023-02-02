package com.veera.orderManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veera.orderManagement.dao.OrderRepositoryDao;
import com.veera.orderManagement.model.Order;


@Service
public class OrderManagementService {

	@Autowired
	OrderRepositoryDao orderRepositoryDao;
	
	public List<Order> getAllOrders() {	
		return orderRepositoryDao.findAll();
	}

	public void insertOrder(Order order) {
		orderRepositoryDao.save(order);
	}

	public void updateOrders(Order order) {
		orderRepositoryDao.save(order);
	}

	public void deleteOrder(Integer orderId) {
		orderRepositoryDao.deleteById(orderId);
		
	}

	public Order getByOrderId(Integer orderId) {
		return orderRepositoryDao.findById(orderId).get();
			
	}
	
}
