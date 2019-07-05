package com.zc.mockito.domain.service;

import com.zc.mockito.domain.model.User;

import java.util.List;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2019/7/5 15:53
 * @Author is zhangchi
 */
public interface UserService {

    public List<User> findUser();

    public User getUser(int id);

}
