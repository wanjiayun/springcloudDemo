package com.wanjiayun.openfeign.controller;

import com.wanjiayun.entity.User;
import com.wanjiayun.openfeign.client.MemberClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feign")
public class MyFeignController {
    @Autowired
    private MemberClient memberClient;
    @GetMapping("/all")
    public List<User> getAllUser(){
        return memberClient.findAllUsers();
    }
}
