package com.example;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * created by dfk
 * 3/12/2022
 */
@SpringBootTest
public class UpdateWrapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test() {
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.like("name","aa")
                .or().gt("age",18);
        wrapper.set("name", "lucia");
        wrapper.set("age", 19);
        System.out.println(userMapper.update(null, wrapper));
    }
}
