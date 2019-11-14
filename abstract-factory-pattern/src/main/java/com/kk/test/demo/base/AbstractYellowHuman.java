package com.kk.test.demo.base;

/**
 * 黄人抽象类
 *
 * @Author kk.xie
 * @Date 2019/10/10 16:29
 * @Version 1.0
 **/
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void name() {
        System.out.println("黄人说话");
    }

    @Override
    public void say() {
        System.out.println("黄人说话");
    }
}
