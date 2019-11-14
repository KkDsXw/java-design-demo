package com.kk.test.demo;

/**
 * 黑人
 *
 * @Author kk.xie
 * @Date 2019/10/9 13:58
 * @Version 1.0
 **/
public class BlackHuman implements Human{
    @Override
    public void name() {
        System.out.println("黑人");
    }

    @Override
    public void say() {
        System.out.println("黑人说话");
    }
}
