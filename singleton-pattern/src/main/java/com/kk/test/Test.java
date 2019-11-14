package com.kk.test;

import com.kk.test.demo.King;
import com.kk.test.demo.King2;
import com.kk.test.demo.King3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试类
 *
 * @Author kk.xie
 * @Date 2019/10/9 11:09
 * @Version 1.0
 **/
public class Test {
    private static ExecutorService executor = Executors.newCachedThreadPool();
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            executor.execute(() -> {
//                King king = King.getInstance();
//                king.sayHello();
//            });
//        }
//
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        for (int i = 0; i < 100; i++) {
//            executor.execute(() -> {
//                King2 king = King2.getInstance();
//                king.sayHello();
//            });
//        }
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        for (int i = 0; i < 100; i++) {
            executor.execute(() -> {
                King3 king = King3.getInstance();
                king.sayHello();
            });
        }

    }
}
