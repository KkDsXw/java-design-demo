package com.kk.test.proxy.impl;

import com.kk.test.proxy.Woman;

/**
 * 媒体
 *
 * @Author kk.xie
 * @Date 2019/10/9 11:02
 * @Version 1.0
 **/
public class MeiPo implements Woman {
    private final Woman woman;

    public MeiPo(Woman woman) {
        this.woman = woman;
    }

    @Override
    public void happy() {
        woman.happy();
    }

    @Override
    public void sayHello() {
        woman.sayHello();
    }
}
