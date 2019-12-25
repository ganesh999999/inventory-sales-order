package com.order.service;

import java.util.List;
import java.util.Optional;

import com.order.entity.Order;

public interface OrderService {
public void createOrder(Order order);
public Optional<Order> getOrderById(String orderId);
public List<Order> getOrders();
}
