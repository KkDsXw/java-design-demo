package com.kk.test.demo.event;

/**
 * 黑名单监控
 *
 * @Author kk.xie
 * @Date 2019/10/11 16:49
 * @Version 1.0
 **/
public class BlackEvent implements Event{
    @Override
    public void event() {
        System.out.println("黑 行为");
    }
}
