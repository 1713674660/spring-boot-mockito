package com.zc.mockito.domain.service.async;

import com.zc.mockito.SpringBootMockitoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Classname ServiceTest
 * @Description TODO
 * @Date 2019/7/5 17:02
 * @Author is zhangchi
 */

@SpringBootTest(classes = SpringBootMockitoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ServiceTest {

    @Autowired
   Service service;

    @Test
    public void print() {
        service.print();
        service.printTest();
    }

}