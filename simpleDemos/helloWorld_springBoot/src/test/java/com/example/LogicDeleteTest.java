package com.example;

import com.example.mapper.UserLogicMapper;
import com.example.service.UserLogicService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * created by dfk
 * 3/12/2022
 */
@SpringBootTest
public class LogicDeleteTest {
    @Autowired
    private UserLogicService userLogicService;
    @Autowired
    private UserLogicMapper userLogicMapper;

    @Test
    public void test() {
        userLogicService.removeById(1L);
        userLogicMapper.deleteById(2L);
    }
}
