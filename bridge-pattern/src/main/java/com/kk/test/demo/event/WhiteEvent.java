package com.kk.test.demo.event;

/**
 * 白名单监控
 *
 * @Author kk.xie
 * @Date 2019/10/11 16:49
 * @Version 1.0
 **/
public class WhiteEvent implements Event{
    @Override
    public void event() {
        System.out.println("白 行为");
    }
}
