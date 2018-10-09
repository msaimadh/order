package com.capgemini.order.service.impl;

import java.util.Optional;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.order.repository.OrderRepository;
import com.capgemini.service.OrderService;
import com.capgemini.service.exception.OrderNotFoundException;

@Service
	public class OrderServiceImpl implements OrderService {

		@Autowired
		OrderRepository orderRepository;
		
		@Override
		public Order addOrder(Order order) {
			return orderRepository.save(order);
		}

		@Override
		public Order updateOrder(Order order) throws OrderNotFoundException {
			return orderRepository.save(order);
		}

		@Override
		public Order findOrderById(int orderId) throws OrderNotFoundException {
			Optional<Order> optionalOrder= orderRepository.findById(orderId);
			if(optionalOrder.isPresent())
				return optionalOrder.get();
			throw new OrderNotFoundException("Order does not exists");
		}

		@Override
		public void deleteOrder(Order order) throws OrderNotFoundException {
			orderRepository.delete(order);
		}

	}


