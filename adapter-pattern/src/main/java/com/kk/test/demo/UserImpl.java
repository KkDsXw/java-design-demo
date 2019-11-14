package com.kk.test.demo;

import java.util.Map;

/**
 * TODO
 *
 * @Author kk.xie
 * @Date 2019/10/10 17:49
 * @Version 1.0
 **/
public class UserImpl implements IUser{

    private Map<String, String> map;

    public UserImpl(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String name() {
        return map.get("name");
    }

    @Override
    public String code() {
        return map.get("code");
    }

    @Override
    public String context() {
        return map.get("context");
    }

}
