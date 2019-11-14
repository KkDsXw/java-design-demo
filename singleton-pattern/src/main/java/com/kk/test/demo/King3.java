package com.kk.test.demo;

import java.util.Objects;

/**
 * 懒汉，线程不安全
 *
 * @Author kk.xie
 * @Date 2019/10/9 11:12
 * @Version 1.0
 **/
public class King3 {
    private static King3 king = null;

    private King3() {
    }

    public static King3 getInstance(){
        if(Objects.isNull(king)){
            king = new King3();
        }
        return king;
    }

    public void sayHello(){
        System.out.println(this + ", sayHello!");

    }
}
