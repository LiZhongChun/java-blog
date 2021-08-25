package com.lzc.controller;


import com.lzc.common.lang.Result;
import com.lzc.entity.User;
import com.lzc.mapper.UserMapper;
import com.lzc.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *  前端控制器
 * @author 关注公众号：MarkerHub
 * @since 2021-08-23
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;

    @RequiresAuthentication
    @GetMapping("/index")
    public Result index(){
        User user = userService.getById(1);
        return Result.success(user);
    }

    @PostMapping ("/save")
    public Result save(@Validated @RequestBody User user){

        return Result.success(user);
    }

    @GetMapping  ("/test")
    public Result test(){
        List<User> users = userMapper.fingAll();

        return Result.success(users);
    }
}
