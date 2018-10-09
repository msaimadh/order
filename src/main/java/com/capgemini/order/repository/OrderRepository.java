package com.capgemini.order.repository;

import javax.persistence.criteria.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, Integer>{

}
