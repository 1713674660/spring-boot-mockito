package com.zc.mockito.domain.service.impl;

import com.zc.mockito.domain.model.User;
import com.zc.mockito.domain.repository.UserRepository;
import com.zc.mockito.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2019/7/5 15:54
 * @Author is zhangchi
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        return userRepository.getOne(id);
    }
}
