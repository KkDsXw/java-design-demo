package com.kk.test;

import com.kk.test.demo.DbPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试
 *
 * @Author kk.xie
 * @Date 2019/10/9 11:29
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                DbPool.info();
                Integer integer = DbPool.openConnection();
                DbPool.info();
                DbPool.closeConnection(integer);
                DbPool.info();
            });

        }

    }
}
