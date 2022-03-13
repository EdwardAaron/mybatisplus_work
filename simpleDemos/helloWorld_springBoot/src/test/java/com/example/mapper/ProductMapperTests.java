package com.example.mapper;

import com.example.pojo.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * created by dfk
 * 3/13/2022
 */
@SpringBootTest
public class ProductMapperTests {
    @Autowired
    private ProductMapper productMapper;

    /**
     * 测试乐观锁，
     *  表中 version 字段不能 null
     *  注意update sql
     *  UPDATE t_product SET name=?, price=?, version=? WHERE id=? AND version=?
     */
    @Test
    public void test() {
        Product productA = productMapper.selectById(11);
        System.out.println(productA);
        productA.setPrice(100);
        productMapper.updateById(productA);
        //第二次没有更新
        productMapper.updateById(productA);
    }
}
