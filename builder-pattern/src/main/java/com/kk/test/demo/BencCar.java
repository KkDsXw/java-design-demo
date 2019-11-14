package com.kk.test.demo;

/**
 * 车
 *
 * @Author kk.xie
 * @Date 2019/10/11 16:13
 * @Version 1.0
 **/
public class BencCar extends CarModel{
    @Override
    protected void start() {
        System.out.println("奔驰启动");
    }

    @Override
    protected void blow() {
        System.out.println("奔驰鸣笛");
    }

    @Override
    protected void refuel() {
        System.out.println("奔驰加油");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰停止");
    }
}
