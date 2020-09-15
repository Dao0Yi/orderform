package com.graduation.order.controller;

import com.graduation.order.services.IOrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class OrderDetailsController {

    @Autowired
    private IOrderDetailsService iOrderDetailsService ;


}
