package com.it.service.impl;

import com.it.bean.User;
import com.it.mapper.UserMapper;
import com.it.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User Login(User user1) {
        return userMapper.Login(user1);

    }
}
