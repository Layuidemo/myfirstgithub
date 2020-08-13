package com.boot.springbootpro.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boot.springbootpro.entity.User1;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Program springbootpro
 * @Package com.boot.springbootpro.mapper
 * @Auther TeacherHuang
 * @Date 2020/8/10 16:43
 * @Version 1.0
 */
@Mapper
public interface User1Mapper extends BaseMapper<User1> {
    void selectlist();
}
