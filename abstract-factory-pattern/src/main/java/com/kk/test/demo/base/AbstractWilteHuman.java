package com.kk.test.demo.base;

/**
 * 白人抽象类
 *
 * @Author kk.xie
 * @Date 2019/10/10 16:29
 * @Version 1.0
 **/
public abstract class AbstractWilteHuman implements Human {
    @Override
    public void name() {
        System.out.println("白人说话");
    }

    @Override
    public void say() {
        System.out.println("白人说话");
    }
}
