package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.enmus.Sex;
import com.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * created by dfk
 * 3/12/2022
 */
@SpringBootTest
public class MybatisPlusEnumTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = new User();
        user.setName("lucia");
        user.setAge(19);
        user.setEmail("123@qq.com");
        user.setSex(Sex.FEMALE);
        userMapper.insert(user);
    }

}
