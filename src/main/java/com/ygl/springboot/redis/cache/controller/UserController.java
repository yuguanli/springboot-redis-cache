package com.ygl.springboot.redis.cache.controller;

import com.ygl.springboot.redis.cache.entity.User;
import com.ygl.springboot.redis.cache.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET,value = "/queryUserList")
    public List<User> queryUserList(){
        List<User> users = userService.queryUserList();
        return users;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/deleteUser")
    public void deleteUser(@RequestParam("id") String id){
       userService.deleteUser(id);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/queryUserName")
    public String queryUserName(String id){
        String name = userService.queryUserName(id);
        return name;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/updateUserName")
    public void updateUserName(@RequestParam("name")String name,@RequestParam("id")String id){
        userService.updateUserName(name,id);
    }
}
