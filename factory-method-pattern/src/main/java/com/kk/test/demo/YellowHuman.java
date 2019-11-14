package com.kk.test.demo;

/**
 * 换种人
 *
 * @Author kk.xie
 * @Date 2019/10/9 13:57
 * @Version 1.0
 **/
public class YellowHuman implements Human{
    @Override
    public void name() {
        System.out.println("黄人");
    }

    @Override
    public void say() {
        System.out.println("黄人说话");
    }
}
