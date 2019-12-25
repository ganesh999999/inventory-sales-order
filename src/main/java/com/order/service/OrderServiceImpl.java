package com.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.entity.Order;
import com.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void createOrder(Order order) {
		orderRepository.saveAndFlush(order);
	}

	@Override
	public Optional<Order> getOrderById(String orderId) {
		Optional<Order> order = orderRepository.findById(orderId);
		return order;
	}

	@Override
	public List<Order> getOrders() {
		List<Order> orders = orderRepository.findAll();
		return orders;
	}

}
