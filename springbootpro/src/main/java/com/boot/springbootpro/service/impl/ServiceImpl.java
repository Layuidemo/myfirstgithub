package com.boot.springbootpro.service.impl;

import com.boot.springbootpro.entity.User1;
import com.boot.springbootpro.entity.User1Vo;
import com.boot.springbootpro.mapper.User1Mapper;
import com.boot.springbootpro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Program springbootpro
 * @Package com.boot.springbootpro.service.impl
 * @Auther TeacherHuang
 * @Date 2020/8/10 16:47
 * @Version 1.0
 */
@Service
public class ServiceImpl implements UserService {
    @Autowired
    User1Mapper user1Mapper;

    @Override
    public User1Vo selectlist() throws Exception {
        List<User1> list=user1Mapper.selectList(null);
        User1Vo user1Vo=new User1Vo();
        user1Vo.setCode(0);
        user1Vo.setMsg("");
        user1Vo.setCount(12300l);
        user1Vo.setData(list);

        return  user1Vo;
    }
}
