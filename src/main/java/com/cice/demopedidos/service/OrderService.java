package com.cice.demopedidos.service;

import com.cice.demopedidos.controller.dto.OrderDTO;
import com.cice.demopedidos.repository.entity.OrderEntity;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    OrderDTO createOrder(OrderDTO orderDTO);

    OrderDTO updateOrder(Long id, OrderDTO orderDTO);

    List<OrderDTO> getAllOrderByidUser(Long user);

    Optional<OrderEntity> getOrderById(Long id);


}
