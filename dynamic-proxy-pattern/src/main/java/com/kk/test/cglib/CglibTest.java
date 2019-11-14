package com.kk.test.cglib;

/**
 * cglib 测试
 *
 * @Author kk.xie
 * @Date 2019/11/13 16:36
 * @Version 1.0
 **/
public class CglibTest {
    public static void main(String[] args) {
        CglibMan man = (CglibMan)new CglibMediaProxy().getIntstance(new CglibMan());
        // 通过代理对象调用目标方法
        man.game();
        man.zufang();
    }
}
