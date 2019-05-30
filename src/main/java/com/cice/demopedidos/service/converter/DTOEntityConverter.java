package com.cice.demopedidos.service.converter;

import com.cice.demopedidos.controller.dto.OrderDTO;
import com.cice.demopedidos.repository.entity.OrderEntity;

public class DTOEntityConverter {


    public OrderDTO convertToDTO(OrderEntity orderEntity){
        OrderDTO orderDTO = null;
        orderDTO = new OrderDTO()
                .setId(orderEntity.getId())
                .setStatus(orderDTO.getStatus())
                .setIProduct(orderEntity.getIProduct())
                .setIUser(orderEntity.getIUser());

        return orderDTO;
    }

    public OrderEntity convertToEntity(OrderDTO orderDTO){
        OrderEntity orderEntity = null;
        orderEntity = new OrderEntity()
                .setId(orderDTO.getId())
                .setStatus(orderDTO.getStatus())
                .setIProduct(orderDTO.getIProduct())
                .setIUser(orderDTO.getIUser());

        return orderEntity;
    }
}
