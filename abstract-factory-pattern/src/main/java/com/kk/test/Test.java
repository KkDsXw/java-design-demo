package com.kk.test;

import com.kk.test.demo.base.Human;
import com.kk.test.demo.factory.ManHumanFactory;
import com.kk.test.demo.factory.WomanHumanFactory;

/**
 * 测试类
 *
 * @Author kk.xie
 * @Date 2019/10/10 16:20
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ManHumanFactory manHumanFactory = new ManHumanFactory();
        Human black = manHumanFactory.createBlack();
        black.name();
        black.say();
        black.sex();

        WomanHumanFactory womanHumanFactory = new WomanHumanFactory();
        Human white = womanHumanFactory.createWhite();
        white.name();
        white.say();
        white.sex();
    }
}
