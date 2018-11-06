package com.example.service;

import com.example.entity.User;

import java.util.List;

public interface UserService {

    User queryUserByPK(int id);

    List<User> queryUserAll();

}
