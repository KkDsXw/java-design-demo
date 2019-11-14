package com.kk.test.jdk.custom;

import java.lang.reflect.Method;

public class $Proxy0 implements com.kk.test.jdk.Person {
    KkInvocationHandler h;

    public $Proxy0(KkInvocationHandler h) {
        this.h = h;
    }

    public void buy() {
        try {
            Method m = com.kk.test.jdk.Person.class.getMethod("buy");
            this.h.invoke(this, m, null);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public void love() {
        try {
            Method m = com.kk.test.jdk.Person.class.getMethod("love");
            this.h.invoke(this, m, null);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}