package com.kk.test.demo;

/**
 * user
 *
 * @Author kk.xie
 * @Date 2019/10/10 17:44
 * @Version 1.0
 **/
public class User {
    private String name;

    private String code;

    private String context;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
