package com.wanjiayun.openfeign.client;

import com.wanjiayun.entity.User;
import com.wanjiayun.openfeign.fallbacm.MemberClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "MEMBER",fallback = MemberClientFallback.class)
public interface MemberClient {
    @RequestMapping("/member/all")
    List<User> findAllUsers();
}
