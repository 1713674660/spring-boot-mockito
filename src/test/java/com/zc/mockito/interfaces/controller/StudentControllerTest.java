package com.zc.mockito.interfaces.controller;

import com.zc.mockito.SpringBootMockitoApplication;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Classname StudentControllerTest
 * @Description TODO
 * @Date 2019/7/5 17:48
 * @Author is zhangchi
 */
@SpringBootTest(classes = SpringBootMockitoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@AutoConfigureMockMvc
public class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void findStudent() {
    }

    @Test
    public void findStudentList() {
    }

    @Test
    public void insert() throws Exception {
        Map<Object, Object> map = new HashMap<>();
        map.put("name", "ceshiming");
        map.put("sex", "男");
        map.put("age", 18);
        map.put("phone", "131");
        map.put("email", "131@163");
        map.put("addr", "address");
        String content = JSONObject.fromObject(map).toString();
        RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/student/insert")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(content);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}