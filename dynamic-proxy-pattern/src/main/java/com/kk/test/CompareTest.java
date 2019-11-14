package com.kk.test;

import com.kk.test.cglib.CglibMan;
import com.kk.test.cglib.CglibMediaProxy;
import com.kk.test.jdk.JdkMan;
import com.kk.test.jdk.JdkMediaProxy;
import com.kk.test.jdk.Person;

/**
 * TODO
 *
 * @Author kk.xie
 * @Date 2019/11/13 17:27
 * @Version 1.0
 **/
public class CompareTest {
    private static int size = 1000000;
    public static void main(String[] args) {
        //  jdk代理比cglib代理性能比较
        /* 耗时单位毫秒ms
        *           jdk    cglib     性能相差(倍)
        * 10        10     130       13
        * 1000      51     187       3.7
        * 1W        220    438       1.99
        * 10w       1508   2229      1.47
        * 100w      13324  14969     1.12
        * */
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Object instance = new JdkMediaProxy(new JdkMan()).getInstance();
            Person person = (Person)instance;
            person.buy();
            person.love();
        }
        long time1 = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Object intstance = new CglibMediaProxy().getIntstance(new CglibMan());
            CglibMan cglibMan = (CglibMan) intstance;
            cglibMan.game();
            cglibMan.zufang();
        }
        long time2 = System.currentTimeMillis() - start;

        System.out.println(time1);
        System.out.println(time2);
    }
}
