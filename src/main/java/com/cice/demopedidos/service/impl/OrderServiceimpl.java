package com.cice.demopedidos.service.impl;

import com.cice.demopedidos.controller.dto.OrderDTO;
import com.cice.demopedidos.repository.OrderRepository;
import com.cice.demopedidos.repository.entity.OrderEntity;
import com.cice.demopedidos.service.OrderService;
import com.cice.demopedidos.service.converter.DTOEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceimpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    DTOEntityConverter convert = new DTOEntityConverter();

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        OrderDTO orderDTO1 = null;
        OrderEntity orderEntity = orderRepository.save(convert.convertToEntity(orderDTO));
        orderDTO1 = convert.convertToDTO(orderEntity);
        return orderDTO1;
    }

    @Override
    public OrderDTO updateOrder(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public User getAllOrderByUser(User user) {
        return null;
    }

    @Override
    public Long getOrderById(Long id) {
        return null;
    }
}
