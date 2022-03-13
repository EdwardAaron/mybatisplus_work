package com.example;

import com.example.pojo.User;
import com.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * created by dfk
 * 3/12/2022
 */
@SpringBootTest
public class IserviceTest {
    @Autowired
    private UserService userService;

    @Test
    public void countTest() {
        System.out.println(userService.count());
    }

    @Test
    public void test() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setName("lucia");
            user.setAge(19 + i);
            users.add(user);
        }
        System.out.println(userService.saveBatch(users));
    }
    //----------------------------------
    /**
     * 自定义
     * 默认情况下，事务是没有开启的,需要手动开启
     *  @EnableTransactionManagement+@Transactiona
     */
    @Test
    public void failSaveTest() {
        try {
            userService.failSave();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
