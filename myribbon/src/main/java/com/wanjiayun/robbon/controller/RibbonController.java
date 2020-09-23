package com.wanjiayun.robbon.controller;

import com.wanjiayun.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/all")
    public String findAllUserInRibbon(){
        String result = restTemplate.getForObject("http://MEMBER/member/all", String.class);
        return result;
    }
    @RequestMapping("/test")
    public String test(){

        return "xxxx";
    }
}
