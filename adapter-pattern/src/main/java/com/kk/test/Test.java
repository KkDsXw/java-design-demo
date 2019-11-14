package com.kk.test;

import com.kk.test.demo.User;
import com.kk.test.demo.UserAdapter;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试
 *
 * @Author kk.xie
 * @Date 2019/10/10 17:42
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap(16);
        map.put("name", "名称");
        map.put("code", "编码");
        map.put("context", "报文");

        UserAdapter userAdapter = new UserAdapter(map);
        User user = userAdapter.get();
        System.out.println(user);
    }
}
