package com.graduation.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.graduation.order.mapper")
public class OrderStarter {
    public static void main(String[] args) {
        SpringApplication.run(OrderStarter.class);
    }
}
