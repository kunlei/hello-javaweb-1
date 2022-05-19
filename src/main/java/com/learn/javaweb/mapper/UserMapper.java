package com.learn.javaweb.mapper;

import com.learn.javaweb.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

  User select(@Param("username") String username, @Param("password") String password);
}