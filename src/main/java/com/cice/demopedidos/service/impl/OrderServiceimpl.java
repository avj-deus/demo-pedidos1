package com.cice.demopedidos.service.impl;

import com.cice.demopedidos.controller.dto.OrderDTO;
import com.cice.demopedidos.repository.OrderRepository;
import com.cice.demopedidos.repository.entity.OrderEntity;
import com.cice.demopedidos.service.OrderService;
import com.cice.demopedidos.service.converter.DTOEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;



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
    public OrderDTO updateOrder(Long id, OrderDTO orderDTO) {
        OrderDTO orderDTO1 = null;
        Optional<OrderEntity> orderById = orderRepository.findById(id);
        if(orderById.isPresent()){
            OrderEntity orderEntity = orderById.get();
            if(orderDTO.getStatus() != null){
                orderById.get().setStatus(orderDTO.getStatus());
            }
            if(orderDTO.getIProduct() != null){
                orderById.get().setIProduct(orderDTO.getIProduct());
            }
            if(orderDTO.getIUser() != null){
                orderById.get().setIUser(orderDTO.getIUser());
            }
        }
        OrderEntity orderEntity = orderRepository.save(orderById.get());
        orderDTO1 = convert.convertToDTO(orderEntity);
        return orderDTO1;
    }

    @Override
    public List<OrderDTO> getAllOrderByidUser(Long idUser) {
        return null;
    }

    @Override
    public Long getOrderById(Long id) {
        return null;
    }
}
