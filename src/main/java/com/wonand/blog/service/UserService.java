package com.wonand.blog.service;

import com.wonand.blog.pojo.User;

public interface UserService {
    User checkUser(String username,String password);
}
