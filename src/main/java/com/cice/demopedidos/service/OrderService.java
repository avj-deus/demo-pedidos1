package com.cice.demopedidos.service;

import com.cice.demopedidos.controller.dto.OrderDTO;

public interface OrderService {

    OrderDTO createOrder(OrderDTO orderDTO);

    OrderDTO updateOrder(OrderDTO orderDTO);

    User getAllOrderByUser(User user);

    Long getOrderById(Long id);


}
