package com.graduation.orderform.model.order;


import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "t_OrderDetails")
public class OrderDetails {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Long datailNum;
    private String orderNum ;
    private Integer pid ;
    private long quantity;
}
