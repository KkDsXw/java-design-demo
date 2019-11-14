package com.kk.test.jdk.custom;

import com.kk.test.jdk.JdkMan;
import com.kk.test.jdk.Person;

/**
 * 自定义java动态代理测试
 *
 * @Author kk.xie
 * @Date 2019/11/14 15:38
 * @Version 1.0
 **/
public class CustomTest {
    public static void main(String[] args) {
        KkMediaProxy kkMediaProxy = new KkMediaProxy(new JdkMan());
        // instance不能转为 JdkMan 对象，因为代理对象是实现了 JdkMan 的顶层接口Person，只能转为Person对象
        Person instance = (Person)kkMediaProxy.getInstance();
        instance.buy();
        instance.love();

    }
}
