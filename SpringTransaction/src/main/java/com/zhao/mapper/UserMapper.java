package com.zhao.mapper;


import com.zhao.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAllUsers();

    int addUser(User user);

    int deleteUser(int id);
}
