package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by dfk
 * 3/12/2022
 */
@SpringBootTest
public class BaseMapperTests {
    @Autowired
    private UserMapper userMapper;

    //自定义
    @Test
    public void selectMapByIdTest() {
        Map<String, Object> map = userMapper.selectMapById(1L);
        map.forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });
    }

    @Test
    public void selectListTest() {
        List<User> users = userMapper.selectList(null);//无条件查询
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void selectByIdTest() {
        System.out.println(userMapper.selectById(1L));
    }

    @Test
    public void selectBatchIds() {
        System.out.println(userMapper.selectBatchIds(Arrays.asList(1L, 2L, 3L)));
    }

    @Test
    public void selectByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "lucia");
        map.put("age", 19);
        System.out.println(userMapper.selectByMap(map));
    }

    @Test
    public void insertTest() {
        User user = new User();
        user.setName("lucia");
        user.setAge(19);
        user.setEmail("123@qq.com");
        System.out.println(userMapper.insert(user));
        System.out.println(user);
    }

    @Test
    public void deleteByIdTest() {
        System.out.println(userMapper.deleteById(1502509930653114369L));
    }

    @Test
    public void deleteByMapTest() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "lucia");
        map.put("age", 19);
        userMapper.deleteByMap(map);
    }

    @Test
    public void deleteBatchIdsTest() {
        System.out.println(userMapper.deleteBatchIds(Arrays.asList(1L, 2L, 3L)));
    }

    @Test
    public void updateTest() {

    }

    @Test
    public void updateByIdTest() {
        User user = new User();
        user.setId(4L);
        user.setName("lucia");
        user.setAge(19);
        user.setEmail("123@qq.com");
        System.out.println(userMapper.updateById(user));
    }


}
