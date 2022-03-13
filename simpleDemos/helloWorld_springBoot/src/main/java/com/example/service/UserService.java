package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * created by dfk
 * 3/12/2022
 */
public interface UserService extends IService<User> {
    @Transactional
    void failSave();

    @Transactional
    void myUpdate(User user);
}
