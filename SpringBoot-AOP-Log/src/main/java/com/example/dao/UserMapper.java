package com.example.dao;

import com.example.entity.User;

import java.util.List;

public interface UserMapper {

    User selectByPK(int id);

    List<User> selectAll();
}
