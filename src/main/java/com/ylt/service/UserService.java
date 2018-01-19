package com.ylt.service;

import com.ylt.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2018/1/16.
 */
public interface UserService {
    List<User> userList();
    void addUser(String uname,String createtime);
}
