package com.example;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
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
public class QueryWrapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectList() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "lu")
                .gt("age", 18)
                .isNotNull("email");
        System.out.println(userMapper.selectList(queryWrapper));
    }

    /**
     * 查询指定字段
     */
    @Test
    public void selectListColumns() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("name", "email");/////////////
        System.out.println(userMapper.selectList(queryWrapper));
    }
    /**
     * condition
     * 条件查询
     * SELECT id,name,age,email FROM user WHERE (age > ?)
     *  因为user.getName()是空的，所以 where 中 没有 name like
     */
    @Test
    public void selectListCondition() {
        User user = new User();
        user.setAge(17);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(user.getName()), "name", user.getName())
                .gt(user.getAge() != null, "age", user.getAge());
        System.out.println(userMapper.selectList(queryWrapper));
    }

    @Test
    public void order() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("age")
                .orderByAsc("id");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void delete() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("email");
        System.out.println(userMapper.delete(queryWrapper));
    }

    @Test
    public void update() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("age", 18)
                .isNotNull("email");
        User user = new User();
        user.setName("aaa");
        user.setAge(100);
        user.setEmail("ddd@qq.com");
        System.out.println(userMapper.update(user, queryWrapper));
    }

    /**
     * UPDATE user SET name=?, age=?, email=? WHERE (age > ? AND (name LIKE ? OR email IS NOT NULL))
     */
    @Test
    public void updateAnd() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .gt("age", 18)
                .and(
                        wrapper -> wrapper.like("name", "a")
                                .or().isNotNull("email"))
        ;
        User user = new User();
        user.setName("aaa");
        user.setAge(100);
        user.setEmail("ddd@qq.com");
        System.out.println(userMapper.update(user, queryWrapper));
    }
}
