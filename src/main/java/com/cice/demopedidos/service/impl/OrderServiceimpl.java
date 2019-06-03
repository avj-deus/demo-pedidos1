package com.cice.demopedidos.service.impl;

import com.cice.demopedidos.controller.dto.OrderDTO;
import com.cice.demopedidos.repository.OrderRepository;
import com.cice.demopedidos.repository.entity.OrderEntity;
import com.cice.demopedidos.service.OrderService;
import com.cice.demopedidos.service.converter.DTOEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
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
        List<OrderDTO> orderDTOList = Collections.EMPTY_LIST;
        orderDTOList = orderRepository.findAllById(Collections.singleton(idUser))
                .stream().map(entity -> convert.convertToDTO(entity))
                .collect(Collectors.toList());
        return orderDTOList;
    }

    @Override
    public Optional<OrderEntity> getOrderById(Long id) {
        Optional<OrderEntity> orderEntity = null;
        orderEntity = orderRepository.findById(id);
        return orderEntity;
    }
}
