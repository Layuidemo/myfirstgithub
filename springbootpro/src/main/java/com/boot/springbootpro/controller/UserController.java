package com.boot.springbootpro.controller;

import com.boot.springbootpro.entity.User1;
import com.boot.springbootpro.entity.User1Vo;
import com.boot.springbootpro.service.UserService;
import com.boot.springbootpro.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Program springbootpro
 * @Package com.boot.springbootpro.controller
 * @Auther TeacherHuang
 * @Date 2020/8/10 17:00
 * @Version 1.0
 */

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("list")
    public User1Vo list() throws Exception {
          return  userService.selectlist();

    }
}
