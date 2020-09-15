package com.graduation.product.mapper;


import com.graduation.orderform.model.product.Product;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;


@Component
public interface ProductMapper extends Mapper<Product> {

}
