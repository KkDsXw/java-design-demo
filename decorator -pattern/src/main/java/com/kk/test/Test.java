package com.kk.test;

import com.kk.test.demo.GrandSon;
import com.kk.test.demo.SonDecorator;

/**
 * test
 *
 * @Author kk.xie
 * @Date 2019/10/11 17:40
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        GrandSon grandSon = new GrandSon();
        grandSon.select();

        SonDecorator sonDecorator = new SonDecorator();
        sonDecorator.select();
    }
}
