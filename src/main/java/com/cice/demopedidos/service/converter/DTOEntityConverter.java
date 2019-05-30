package com.cice.demopedidos.service.converter;

import com.cice.demopedidos.controller.dto.OrderDTO;
import com.cice.demopedidos.repository.entity.OrderEntity;

public class DTOEntityConverter {


    public OrderDTO convertToDTO(OrderEntity orderEntity){
        OrderDTO orderDTO = null;
        orderDTO = new OrderDTO()
                .setId(orderEntity.getId())
                .setProduct(orderEntity.getProduct())
                .setUser(orderEntity.getUser());

        return orderDTO;
    }

    public OrderEntity convertToEntity(OrderDTO orderDTO){
        OrderEntity orderEntity = null;
        orderEntity = new OrderEntity()
                .setId(orderDTO.getId())
                .setProduct(orderDTO.getProduct())
                .setUser(orderDTO.getUser());

        return orderEntity;
    }
}
