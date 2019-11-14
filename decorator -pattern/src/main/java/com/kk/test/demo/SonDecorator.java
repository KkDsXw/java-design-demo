package com.kk.test.demo;

/**
 * Son类装饰器
 *
 * @Author kk.xie
 * @Date 2019/10/11 17:44
 * @Version 1.0
 **/
public class SonDecorator extends Son{

    @Override
    public void select() {
        System.out.println("装饰下select");
        super.select();
    }

    @Override
    public void start() {
        System.out.println("装饰下start");
        super.start();
    }

    @Override
    public void end() {
        System.out.println("装饰下end");
        super.end();
    }
}
