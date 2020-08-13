package com.boot.springbootpro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Program springbootpro
 * @Package com.boot.springbootpro.entity
 * @Auther TeacherHuang
 * @Date 2020/8/10 17:52
 * @Version 1.0
 */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User1Vo<T> {
    private int code;
    private  String msg;
    private  long count;
    private List<T> data;

}
