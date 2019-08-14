package com.it.mapper;

import com.it.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface UserMapper {

    User Login(User user1) ;
}
