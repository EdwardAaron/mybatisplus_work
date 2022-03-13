package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.UserMapper;
import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * created by dfk
 * 3/12/2022
 */
@Service
public class UserServiceImpl
        extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void failSave() {
        User user = new User();
        user.setName("lucia");
        user.setAge(20);
        save(user);
        if (user.getAge() > 19) {
            throw new RuntimeException();
        }

    }

    @Override
    public void myUpdate(User user) {
        User savedUser = userMapper.selectById(1);
        savedUser.setName(user.getName());
        userMapper.updateById(savedUser);
    }
}
