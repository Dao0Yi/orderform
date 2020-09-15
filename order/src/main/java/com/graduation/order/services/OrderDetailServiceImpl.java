package com.graduation.order.services;

import com.graduation.order.mapper.OrderDetailsMapper;
import com.graduation.orderform.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl implements IOrderDetailsService {

    @Autowired
    private OrderDetailsMapper orderDetailsMapper ;

}
