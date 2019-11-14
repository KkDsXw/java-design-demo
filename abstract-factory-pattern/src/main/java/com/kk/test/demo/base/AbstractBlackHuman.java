package com.kk.test.demo.base;

/**
 * 黑人抽象类
 *
 * @Author kk.xie
 * @Date 2019/10/10 16:29
 * @Version 1.0
 **/
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void name() {
        System.out.println("黑人名称");
    }

    @Override
    public void say() {
        System.out.println("黑人说话");
    }
}
