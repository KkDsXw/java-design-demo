package com.kk.test.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 媒介
 *
 * @Author kk.xie
 * @Date 2019/11/13 16:02
 * @Version 1.0
 **/
public class JdkMediaProxy implements InvocationHandler {
    /**被代理的对象*/
    private Object target;

    public JdkMediaProxy(Object target) {
        this.target = target;
    }

    public Object getInstance(){
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("媒介正在进行代理工作..." + method);
        return method.invoke(target, args);
    }
}
