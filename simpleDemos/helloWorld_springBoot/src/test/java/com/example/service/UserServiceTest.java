package com.example.service;

import com.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * created by dfk
 * 3/13/2022
 */
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    /**
     * myUpdate 添加了@transactional 注解，所以用的是同一个session
     */
    @Test
    public void myUpdateTest() {
        User user = new User();
        userService.myUpdate(user);
    }
}
