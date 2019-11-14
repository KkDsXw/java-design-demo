package com.kk.test.demo;

/**
 * 饿汉模式
 * 未使用前就创建好实例，所以没有现成安全问题
 * 缺点：可能造成资源的浪费
 *
 * @Author kk.xie
 * @Date 2019/10/9 11:12
 * @Version 1.0
 **/
public class King {
    private static final King king = new King();

    private King() {
    }

    public static King getInstance(){
        return king;
    }

    public void sayHello(){
        System.out.println(this + ", sayHello!");

    }
}
