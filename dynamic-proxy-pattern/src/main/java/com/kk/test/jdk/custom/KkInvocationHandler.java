package com.kk.test.jdk.custom;

import java.lang.reflect.Method;

/**
 *
 *
 * @Author kk.xie
 * @Date 2019/11/14 11:42
 * @Version 1.0
 **/
public interface KkInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
