package com.citrsw.apiexample.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citrsw.apiexample.entity.User;
import com.citrsw.apiexample.mapper.UserMapper;
import com.citrsw.apiexample.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* 管理员ServiceImpl
*
* @author Zhenfeng Li
* @version 0.0.1
* @date 2020-04-01 08:04:05
*/
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements  UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

}