package com.example.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
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
@DS("master")//该类的所有方法从master数据库查询
//@Transactional 添加事务控制
public class UserServiceImpl
        extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;


    @DS("slave_1")//从数据库slave_1查询
    public User getUserFromSlave() {
        return userMapper.selectById(1);
    }
}
