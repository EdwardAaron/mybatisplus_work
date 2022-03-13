package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.User;
import com.example.pojo.UserLogic;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * created by dfk
 * 3/12/2022
 */
@Repository
public interface UserLogicMapper extends BaseMapper<UserLogic> {

}
