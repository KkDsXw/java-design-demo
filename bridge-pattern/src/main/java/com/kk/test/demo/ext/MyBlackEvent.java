package com.kk.test.demo.ext;

import com.kk.test.demo.event.BlackEvent;

/**
 * 扩展 行为
 *
 * @Author kk.xie
 * @Date 2019/10/11 16:56
 * @Version 1.0
 **/
public class MyBlackEvent extends BlackEvent {
    @Override
    public void event() {
        super.event();
        System.out.println("继承扩展了");
    }

    public void say(){
        System.out.println("------警报-------");
    }
}
