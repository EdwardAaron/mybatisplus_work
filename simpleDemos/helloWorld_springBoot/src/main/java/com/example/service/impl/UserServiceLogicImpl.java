package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.UserLogicMapper;
import com.example.mapper.UserMapper;
import com.example.pojo.User;
import com.example.pojo.UserLogic;
import com.example.service.UserLogicService;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

/**
 * created by dfk
 * 3/12/2022
 */
@Service
public class UserServiceLogicImpl
        extends ServiceImpl<UserLogicMapper, UserLogic> implements UserLogicService {
}
