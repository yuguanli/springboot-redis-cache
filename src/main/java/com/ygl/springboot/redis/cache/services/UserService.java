package com.ygl.springboot.redis.cache.services;
import com.ygl.springboot.redis.cache.config.CacheExpire;
import com.ygl.springboot.redis.cache.entity.User;
import com.ygl.springboot.redis.cache.mapper.UserMapper;
import com.ygl.springboot.redis.cache.utils.DateUtils;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@CacheConfig(cacheNames = "user")
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> queryUser(){
        List<User> users = userMapper.selectAll();
        return users;
    }

    public void deleteUser(String id){
        userMapper.deleteUserById(id);
    }

    public String queryUserName(String id) {
       String name = userMapper.queryUserName(id);
       return name;
    }

    public void updateUserName(String name,String id) {
        userMapper.updateUserName(name,id);
    }

    @Cacheable(key = "'user_list'")
    @CacheExpire(expire = 60,expireDay = "ENDDAY")
    public List<User> queryUserList(){
        List<User> userList = userMapper.queryList();
        return userList;
    }
}
