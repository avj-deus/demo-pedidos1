package com.cice.demopedidos.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Table(name = "order")

public class OrderEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String status;
    private Long iProduct;
    private Long iUser;


}
