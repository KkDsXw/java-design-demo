package com.kk.test.jdk.custom;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @Author kk.xie
 * @Date 2019/11/14 15:44
 * @Version 1.0
 **/
public class KkMediaProxy implements KkInvocationHandler{

    private Object target;

    public KkMediaProxy(Object target) {
        this.target = target;
    }

    public Object getInstance(){
        Class clazz = target.getClass();
        return KkProxy.newProxyInstance(new KkClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("自定义媒介正在进行代理工作..." + method);
        return method.invoke(target, args);
    }
}
