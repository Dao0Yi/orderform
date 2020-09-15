package com.graduation.web.controller;

import com.alibaba.fastjson.JSON;
import com.graduation.orderform.model.common.ResultBean;
import com.graduation.orderform.model.product.Product;
import com.graduation.orderform.model.user.User;
import com.graduation.web.clients.ProductClient;
import com.graduation.web.clients.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gw")
public class ProductController {

    @Autowired
    private ProductClient productClient ;

    @Autowired
    private UserClient userClient;

   /* @Autowired
    private StringRedisTemplate stringRedisTemplate ;*/

    @RequestMapping("/p1") //调用产品微服务查询所有的产品信息
    public ResultBean getAllProduct(@RequestParam(name = "pageIndex") int pageIndex, @RequestParam(name = "pageSize") int pageSize) {
       return productClient.getAllProduct(pageIndex,pageSize);
    }
    @RequestMapping("/p2") //调用产品微服务查询当前的产品信息
    public ResultBean getAllProduct(@RequestParam(name = "pid") Integer pid ) {
        return productClient.getOneProduct(pid);
    }

    @RequestMapping("/p3/{pid}") //调用产品微服务查询当前的产品信息
    public ResultBean addCar(@PathVariable(name = "pid") Integer pid ) {
        return productClient.addToProduct(pid);
    }

    @RequestMapping("/g1") //调用产品微服务查询当前的产品信息
    public ResultBean login(@RequestBody User user ) {
        return userClient.verification(user);
    }

}
