package com.kk.test.jdk;

/**
 * 男人
 *
 * @Author kk.xie
 * @Date 2019/11/13 16:04
 * @Version 1.0
 **/
public class JdkMan implements Person{
    @Override
    public void buy() {
        System.out.println("男人要买东西");
    }

    @Override
    public void love() {
        System.out.println("男人要恋爱");
    }
}
