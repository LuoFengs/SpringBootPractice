package com.springboot.demo.service;

import com.springboot.demo.service.entity.User;

import java.util.List;

public interface UserService {

    User queryUserByPK(int id);

    List<User> queryUserAll();

}
