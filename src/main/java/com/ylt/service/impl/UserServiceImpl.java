package com.ylt.service.impl;

import com.ylt.mapper.UserMapper;
import com.ylt.pojo.User;
import com.ylt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/1/16.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userList() {
        List<User> users = userMapper.userList();
        return users;
    }
    @Transactional
    @Override
    public void addUser(String uname, String createtime) {
        userMapper.addUser(uname,createtime);
    }
}
