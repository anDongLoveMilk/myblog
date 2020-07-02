package com.wonand.blog.service.impl;

import com.wonand.blog.mapper.UserMapper;
import com.wonand.blog.pojo.User;
import com.wonand.blog.service.UserService;
import com.wonand.blog.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public User checkUser(String username, String password) {
        return userMapper.findByUsernameAndPassword(username, MD5Utils.code(password));
    }
}
