package com.kk.test;

import com.kk.test.proxy.Woman;
import com.kk.test.proxy.impl.BeautyWoman;
import com.kk.test.proxy.impl.BeautyWoman2;
import com.kk.test.proxy.impl.MeiPo;

/**
 * 测试
 *
 * @Author kk.xie
 * @Date 2019/10/9 10:59
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Woman woman = new BeautyWoman();
        Woman woman2 = new BeautyWoman2();

        Woman b1 = new MeiPo(woman);
        Woman b2 = new MeiPo(woman2);

        b1.happy();
        b1.sayHello();

        b2.happy();
        b2.sayHello();
    }
}
