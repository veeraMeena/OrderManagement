package com.veera.orderManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veera.orderManagement.model.Order;

public interface OrderRepositoryDao extends JpaRepository<Order,  Integer> {

	
}
