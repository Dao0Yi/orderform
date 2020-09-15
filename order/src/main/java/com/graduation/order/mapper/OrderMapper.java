package com.graduation.order.mapper;

import com.graduation.orderform.model.order.Order;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
@Component
public interface OrderMapper extends Mapper<Order> {
}
