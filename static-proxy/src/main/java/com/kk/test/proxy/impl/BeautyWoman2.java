package com.kk.test.proxy.impl;

import com.kk.test.proxy.Woman;

/**
 * 美女1
 *
 * @Author kk.xie
 * @Date 2019/10/9 11:03
 * @Version 1.0
 **/
public class BeautyWoman2 implements Woman {
    @Override
    public void happy() {
        System.out.println(this.getClass().getName() + ", happy!");
    }

    @Override
    public void sayHello() {
        System.out.println(this.getClass().getName() + ", sayHello!");
    }
}
