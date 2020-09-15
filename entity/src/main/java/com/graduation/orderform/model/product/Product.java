package com.graduation.orderform.model.product;


import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data

@Table(name = "t_PRODUCT")
public class Product {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer pid ;
    private String pname ;
    private Float pprice ;
}
