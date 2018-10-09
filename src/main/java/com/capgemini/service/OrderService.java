package com.capgemini.service;

import javax.persistence.criteria.Order;

import com.capgemini.service.exception.OrderNotFoundException;

public interface OrderService {
	
	public Order addOrder(Order order);

	public Order updateOrder(Order order)throws OrderNotFoundException;

	public Order findOrderById(int orderId) throws OrderNotFoundException;

	public void deleteOrder(Order order)throws OrderNotFoundException;
}


