package com.boot.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.mapper"})
@ComponentScan(basePackages = {"com.controller","com.serviceImpl"})
public class SpringbootMybatisWarehouseManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisWarehouseManagementApplication.class, args);
    }

}
