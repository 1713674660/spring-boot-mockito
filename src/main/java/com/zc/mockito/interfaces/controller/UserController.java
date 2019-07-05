package com.zc.mockito.interfaces.controller;

import com.zc.mockito.domain.model.User;
import com.zc.mockito.domain.service.UserService;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2019/7/5 15:55
 * @Author is zhangchi
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userList")
    @ResponseBody
    public List<User> findList(){
        return userService.findUser();
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public User findUser(@PathVariable("id") int id){
        return userService.getUser(id);
    }
}
