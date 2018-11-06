package com.springboot.demo.service.impl;

import com.springboot.demo.service.UserService;
import com.springboot.demo.service.dao.UserMapper;
import com.springboot.demo.service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByPK(int id) {
        return userMapper.selectByPK(id);
    }

    @Override
    public List<User> queryUserAll() {
        return userMapper.selectAll();
    }
}
