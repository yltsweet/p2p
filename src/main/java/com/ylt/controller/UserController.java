package com.ylt.controller;

import com.ylt.pojo.User;
import com.ylt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/1/16.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * aaaaa
     * @return
     */
    @RequestMapping(value = "/userList",produces = "text/plain;charset=UTF-8")
    public List<User> userList(){
        List<User> users = userService.userList();
        for (User user:users){
            user.setCreateDate(new Date());
        }
        return users;
    }
    @RequestMapping(value = "/addUser",produces = "text/plain;charset=UTF-8")
    public String addUser(String uname,String createtime){
        userService.addUser(uname,createtime);
        return "ok";
    }


}
