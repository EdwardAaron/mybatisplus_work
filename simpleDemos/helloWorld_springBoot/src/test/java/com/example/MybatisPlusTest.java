package com.example;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * created by dfk
 * 3/12/2022
 */
@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    /**
     * mysql page :limit startIndex pageSize
     */
    @Test
    public void selectPage() {
        Page<User> page = new Page<>(2,3);
        Page<User> result=userMapper.selectPage(page, null);
        System.out.println(result.getRecords());
        System.out.println(result.getPages());
        System.out.println(result.hasNext());
        System.out.println(result.hasPrevious());
    }
}
