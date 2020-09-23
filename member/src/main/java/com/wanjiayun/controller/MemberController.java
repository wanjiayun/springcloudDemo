package com.wanjiayun.controller;

import com.wanjiayun.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Value("${server.port}")
    private Integer port;
     @GetMapping("/all")
    public List<User> findAllUsers(){
         List<User> userList = new ArrayList<>();
         userList.add(new User(port,"张三","宿松"));
         userList.add(new User(port,"李四","宿松"));
         return userList;
     }
}
