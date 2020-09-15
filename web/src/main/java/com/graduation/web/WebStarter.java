package com.graduation.web;

import com.graduation.web.clients.ProductClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.graduation.web.clients")
@EnableFeignClients  //微服务调用！！！
public class WebStarter {
    public static void main(String[] args) {
        SpringApplication.run(WebStarter.class);
    }
}
