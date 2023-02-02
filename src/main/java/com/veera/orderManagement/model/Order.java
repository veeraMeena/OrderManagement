package com.veera.orderManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name="order_data")
@Data
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Integer orderId;

	Integer  customerId;
	
	String itemName;
	
	Float price;
	
}
