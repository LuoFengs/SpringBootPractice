package com.springboot.demo.service.dao;

import com.springboot.demo.service.entity.User;

import java.util.List;

public interface UserMapper {

    User selectByPK(int id);

    List<User> selectAll();
}
