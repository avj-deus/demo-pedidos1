package com.cice.demopedidos.controller;

import com.cice.demopedidos.controller.dto.OrderDTO;
import com.cice.demopedidos.repository.entity.OrderEntity;
import com.cice.demopedidos.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderResources {

    @Autowired
    OrderService orderService;

    @RequestMapping(path = "/orders", method = RequestMethod.POST)
    public OrderDTO createOrder(@RequestBody OrderDTO orderDTO){
        OrderDTO response = null;
        response = orderService.createOrder(orderDTO);
        return response;
    }
    @RequestMapping(path = "orderupdate", method = RequestMethod.PATCH)
    public ResponseEntity<OrderDTO> updateOrder(@PathVariable(name = "id")Long id, @RequestBody OrderDTO orderDTO){
        ResponseEntity<OrderDTO> orderDTOResponseEntity = null;
        OrderDTO orderDTO1 = orderService.updateOrder(id, orderDTO);
        orderDTOResponseEntity = ResponseEntity.ok(orderDTO1);
        return orderDTOResponseEntity;
    }
    @RequestMapping(path = "getorder", method = RequestMethod.GET)
    public Optional<OrderEntity> getOrderBiId(@PathVariable(name = "id")Long id){
        Optional<OrderEntity> orderEntity = orderService.getOrderById(id);
        if(!orderEntity.isPresent());
        return orderEntity;
    }

    public ResponseEntity<List<OrderDTO>> getAllOrderByIdUser(@PathVariable(name = "iUser")Long id){
        ResponseEntity<List<OrderDTO>> listResponseEntity = null;
        List<OrderDTO> orderDTOList = orderService.getAllOrderByidUser(id);
        listResponseEntity = ResponseEntity.ok(orderDTOList);
        return listResponseEntity;
    }

}
