package com.capgemini.order;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.order.repository.OrderRepository;
import com.capgemini.order.service.impl.OrderServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {
	
	@Mock
	private OrderRepository orderRepository;
	
	@InjectMocks
	 private OrderServiceImpl orderServiceimpl;
	
}