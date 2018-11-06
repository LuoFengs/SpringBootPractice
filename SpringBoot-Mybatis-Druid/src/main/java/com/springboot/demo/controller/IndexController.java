package com.springboot.demo.controller;

import com.springboot.demo.service.UserService;
import com.springboot.demo.service.entity.User;
import com.springboot.demo.utils.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private TestConfigBean testConfigBean;

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("/")
    String index(){
        return testConfigBean.getName();
    }

    @RequestMapping("/show")
    String show(){
        return testConfigBean.getShow();
    }

    @RequestMapping("/user/{id}")
    User userById(@PathVariable("id")Integer id){
        User user = userServiceImpl.queryUserByPK(id);
        return user;
    }

    @RequestMapping("/userAll")
    List<User> userAll(){
       return userServiceImpl.queryUserAll();
    }

}
