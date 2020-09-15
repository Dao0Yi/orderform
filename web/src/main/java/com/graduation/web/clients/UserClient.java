package com.graduation.web.clients;

import com.graduation.orderform.model.common.ResultBean;
import com.graduation.orderform.model.user.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient("order-user")
public interface UserClient {

    @RequestMapping
    ResultBean verification(@RequestParam(name = "user")User user);
}
