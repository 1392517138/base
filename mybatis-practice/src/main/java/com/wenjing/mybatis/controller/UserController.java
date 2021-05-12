package com.wenjing.mybatis.controller;

import com.wenjing.mybatis.dao.UserMapper;
import com.wenjing.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Aaron
 * @description
 * @date 2021/5/10 下午5:46
 */
@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/findById")
    public String findById(int id) {
        User byIdUser = userMapper.findById(id);
        return byIdUser.toString();
    }
    @RequestMapping("/saveUser")
    public String saveUser(@RequestParam String name,@RequestParam int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        int i = userMapper.saveUser(user);
        return String.valueOf(i);
    }
}
