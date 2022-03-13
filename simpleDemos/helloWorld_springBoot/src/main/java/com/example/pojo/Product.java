package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * created by dfk
 * 3/13/2022
 */
@TableName("t_product")
@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    @Version//乐观锁字段
    private Integer version;
}
