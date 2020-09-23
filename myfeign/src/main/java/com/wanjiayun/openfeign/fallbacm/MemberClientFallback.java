package com.wanjiayun.openfeign.fallbacm;

import com.wanjiayun.entity.User;
import com.wanjiayun.openfeign.client.MemberClient;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
@Component
public class MemberClientFallback implements MemberClient {
    @Override
    public List<User> findAllUsers() {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(0,"无名氏","服务器卡住了"));
        return list;
    }
}
