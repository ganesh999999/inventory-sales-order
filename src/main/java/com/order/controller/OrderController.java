package com.order.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.entity.Order;
import com.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;

	@PostMapping
	public void createOrder(@RequestBody Order order) {
		orderService.createOrder(order);
	}

	@GetMapping("/{orderId}")
	public Optional<Order> getOrderById(@PathVariable String orderId) {
		Optional<Order> order = orderService.getOrderById(orderId);
		return order;
	}

	@GetMapping
	public List<Order> getOrders() {
		List<Order> orders = orderService.getOrders();
		return orders;
	}
}
