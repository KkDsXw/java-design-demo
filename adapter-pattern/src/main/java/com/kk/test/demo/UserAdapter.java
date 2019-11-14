package com.kk.test.demo;

import java.util.Map;

/**
 * 用户适配器
 *
 * @Author kk.xie
 * @Date 2019/10/10 17:53
 * @Version 1.0
 **/
public class UserAdapter {
    private IUser iUser;

    public UserAdapter(Map<String, String> map) {
        this.iUser = new UserImpl(map);
    }

    public User get() {
        User user = new User();
        user.setCode(iUser.code());
        user.setName(iUser.name());
        user.setContext(iUser.context());
        return user;
    }
}
