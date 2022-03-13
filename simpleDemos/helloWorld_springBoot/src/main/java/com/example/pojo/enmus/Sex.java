package com.example.pojo.enmus;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * created by dfk
 * 3/13/2022
 */
@Getter
public enum Sex {
    MALE(0, "男"), FEMALE(1, "女");

    Sex(Integer val, String name) {
        this.val = val;
        this.name = name;
    }
    @EnumValue//与数据库对应的字段
    private Integer val;

    private String name;
}
