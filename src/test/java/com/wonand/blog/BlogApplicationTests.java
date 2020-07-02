package com.wonand.blog;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.wonand.blog.pojo.User;
import com.wonand.blog.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    UserService userService;


    @Test
    void contextLoads() {
        User user =  userService.checkUser("root","123456");
    }

}
