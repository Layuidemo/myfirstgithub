package com.boot.springbootpro.service;

import com.boot.springbootpro.entity.User1;
import com.boot.springbootpro.entity.User1Vo;
import org.apache.catalina.User;

import java.util.List;

/**
 * @Program springbootpro
 * @Package com.boot.springbootpro.service
 * @Auther TeacherHuang
 * @Date 2020/8/10 16:47
 * @Version 1.0
 */
public interface UserService {
    User1Vo selectlist()throws  Exception;
}
