package com.wonand.blog.mapper;

import com.wonand.blog.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper     //是mybatis的mapper类
@Repository  //被spring整合
public interface UserMapper {

    User findByUsernameAndPassword(String userName,String passWord);
}
