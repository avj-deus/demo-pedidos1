package com.cice.demopedidos.controller.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)

public class OrderDTO {


    private Long id;
    private String status;
    private Long iProduct;
    private Long iUser;
}
