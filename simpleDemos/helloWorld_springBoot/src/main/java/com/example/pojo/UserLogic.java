package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * created by dfk
 * 3/12/2022
 */

@Data
@TableName("user_logic")
public class UserLogic {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableLogic//逻辑删除字段
    private Integer isDeleted;
}
