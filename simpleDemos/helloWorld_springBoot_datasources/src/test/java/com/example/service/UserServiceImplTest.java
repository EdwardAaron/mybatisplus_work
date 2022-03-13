package com.example.service;

import com.example.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * created by dfk
 * 3/13/2022
 */
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userService;

    /**
     * 从slave1 数据源查找数据
     */
    @Test
    public void getUserFromSlave() {
        System.out.println(userService.getUserFromSlave());
    }
    /**
     * 从master 数据源查找数据
     */
    @Test
    public void getById() {
        System.out.println(userService.getById(1L));
    }

}
