package com.cice.demopedidos.service;

import com.cice.demopedidos.controller.dto.OrderDTO;

import java.util.List;

public interface OrderService {

    OrderDTO createOrder(OrderDTO orderDTO);

    OrderDTO updateOrder(Long id, OrderDTO orderDTO);

    List<OrderDTO> getAllOrderByidUser(Long user);

    Long getOrderById(Long id);


}
