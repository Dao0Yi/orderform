package com.graduation.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.graduation.user.mapper")
public class UserStarter {
    public static void main(String[] args) {
        SpringApplication.run(UserStarter.class);
    }
}
