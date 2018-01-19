package com.ylt.mapper;

import com.ylt.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/1/16.
 */
public interface UserMapper {
    @Select("select * from user")
    List<User> userList();
    @Insert("insert into user(uname,createtime) values(#{uname},#{createtime})")
    void addUser(@Param("uname") String uname, @Param("createtime") String createtime);
}
