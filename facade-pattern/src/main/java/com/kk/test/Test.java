package com.kk.test;

import com.kk.test.demo.ModenPostOffice;

/**
 * 测试
 *
 * @Author kk.xie
 * @Date 2019/10/10 17:25
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("这是内容", "这是地址");
    }
}
