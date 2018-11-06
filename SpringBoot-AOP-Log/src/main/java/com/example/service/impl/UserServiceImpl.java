package com.example.service.impl;

import com.example.dao.UserMapper;
import com.example.entity.User;
import com.example.service.UserService;
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
