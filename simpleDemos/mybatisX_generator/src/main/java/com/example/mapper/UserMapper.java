package com.example.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-03-13 19:41:37
* @Entity com.example.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {
    int insertSelective(User user);

    List<User> selectAllByAgeOrderByAge(@Param("age") Integer age);
}




