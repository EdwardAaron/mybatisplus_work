package com.example;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
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
public class LambdaQueryWrapperTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test() {
        LambdaQueryWrapper <User>wrapper = new LambdaQueryWrapper<>();
        User user = new User();
        user.setAge(17);
        wrapper.
                like(StringUtils.isNotBlank(user.getName()),
                        User::getName, user.getName());
        System.out.println(userMapper.selectList(wrapper));
    }
}
