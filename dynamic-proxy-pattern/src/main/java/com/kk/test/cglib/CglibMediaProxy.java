package com.kk.test.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import javax.print.attribute.standard.PrinterURI;
import java.lang.reflect.Method;

/**
 * 媒介代理
 *
 * @Author kk.xie
 * @Date 2019/11/13 16:33
 * @Version 1.0
 **/
public class CglibMediaProxy implements MethodInterceptor {

    public Object getIntstance(Object obj){
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(obj.getClass());
        // 设置enhancer的回调对象
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        System.out.println("cglib 代理在工作！" + method);
        Object object = methodProxy.invokeSuper(o, objects);
        return object;
    }
}
