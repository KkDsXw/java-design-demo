package com.kk.test.demo;

/**
 * 白人
 *
 * @Author kk.xie
 * @Date 2019/10/9 13:58
 * @Version 1.0
 **/
public class WhiteHuman implements Human{
    @Override
    public void name() {
        System.out.println("白人");
    }

    @Override
    public void say() {
        System.out.println("白人说话");
    }
}
