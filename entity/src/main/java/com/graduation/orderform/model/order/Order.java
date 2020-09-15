package com.graduation.orderform.model.order;


import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "t_order")
public class Order {

    private String orderNum ;
    private Long ouid ;
    private String ouaddress ;
    private String ostatus ;


}
