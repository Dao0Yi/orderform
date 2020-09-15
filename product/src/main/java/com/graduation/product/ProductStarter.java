package com.graduation.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.graduation.product.mapper")
public class ProductStarter {
    public static void main(String[] args) {
        SpringApplication.run(ProductStarter.class);
    }
}
