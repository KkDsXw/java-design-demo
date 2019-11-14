package com.kk.test.demo;

import java.util.Objects;

/**
 * 懒汉模式
 * 优点：不会造成资源的浪费
 * 缺点：有现成安全问题，需要加synchronized关键字保证现成安全，但会牺牲性能
 *
 * @Author kk.xie
 * @Date 2019/10/9 11:12
 * @Version 1.0
 **/
public class King2 {
    private static King2 king = null;

    private King2() {
    }

    public synchronized static King2 getInstance(){
        if(Objects.isNull(king)){
            king = new King2();
        }
        return king;
    }

    public void sayHello(){
        System.out.println(this + ", sayHello!");

    }
}
