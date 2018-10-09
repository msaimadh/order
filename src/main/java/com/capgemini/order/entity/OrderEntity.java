package com.capgemini.order.entity;

public class OrderEntity {
	
	private  int OrderId;
	private  int OrderQuantity;
	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderEntity(int orderId, int orderQuantity) {
		super();
		OrderId = orderId;
		OrderQuantity = orderQuantity;
	}
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public int getOrderQuantity() {
		return OrderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		OrderQuantity = orderQuantity;
	}
	
	

}
