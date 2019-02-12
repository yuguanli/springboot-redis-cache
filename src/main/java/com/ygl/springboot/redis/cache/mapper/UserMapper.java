package com.ygl.springboot.redis.cache.mapper;
import com.ygl.springboot.redis.cache.entity.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.MyMapper;

import java.util.List;

public interface UserMapper extends MyMapper<User> {

    void deleteUserById(@Param("id") String id);

    String queryUserName(@Param("id") String id);

    void updateUserName(@Param("name") String name, @Param("id") String id);

    List<User> queryList();
}