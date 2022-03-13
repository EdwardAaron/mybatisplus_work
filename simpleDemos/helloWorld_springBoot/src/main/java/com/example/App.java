package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * created by dfk
 * 3/12/2022
 */
@SpringBootApplication
@MapperScan("com.example.mapper")
@EnableTransactionManagement//开启事务管理
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
