package com.boot.springbootpro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @Program springbootpro
 * @Package com.boot.springbootpro.entity
 * @Auther TeacherHuang
 * @Date 2020/8/10 16:36
 * @Version 1.0
 */


@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User1 {

    private int id;
    private String name;
    private  int age;
}
