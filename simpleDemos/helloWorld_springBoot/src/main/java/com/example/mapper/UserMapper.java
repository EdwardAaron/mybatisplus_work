package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * created by dfk
 * 3/12/2022
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * 自定义
     * 根据id查询用户信息对应的map
     */
    Map<String, Object> selectMapById(@Param("id") Long id);

    /**
     * 根据年龄查询用户信息，并且分页
     */
    Page<User> selectPageByAge(@Param("page") Page<User> page, @Param("age") Integer age);
}
