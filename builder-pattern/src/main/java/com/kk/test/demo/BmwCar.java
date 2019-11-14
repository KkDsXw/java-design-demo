package com.kk.test.demo;

/**
 * 车
 *
 * @Author kk.xie
 * @Date 2019/10/11 16:13
 * @Version 1.0
 **/
public class BmwCar extends CarModel{
    @Override
    protected void start() {
        System.out.println("宝马启动");
    }

    @Override
    protected void blow() {
        System.out.println("宝马鸣笛");
    }

    @Override
    protected void refuel() {
        System.out.println("宝马加油");
    }

    @Override
    protected void stop() {
        System.out.println("宝马停止");
    }
}
