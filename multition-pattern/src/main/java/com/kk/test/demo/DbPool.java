package com.kk.test.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据库连接池,多例模式
 *
 * @Author kk.xie
 * @Date 2019/10/9 11:30
 * @Version 1.0
 **/
public class DbPool {
    private static List<Integer> poolNotActiveList = new ArrayList<>();

    private static List<Integer> poolActiveList = new ArrayList<>();

    /**连接池大小*/
    private static int poolSize = 10;
    /**活跃数*/
    private static int pooAvticeSize = 0;
    /**非活跃数*/
    private static int pooNotActiceSize = 10;

    static {
        init();
    }

    private static void init(){
        for (int i = 0; i < poolSize; i++) {
            poolNotActiveList.add(i);
        }

        pooNotActiceSize = poolNotActiveList.size();
        pooAvticeSize = poolSize - pooNotActiceSize;
    }

    public synchronized static Integer openConnection(){
        if(pooNotActiceSize > 0){
            Integer integer = poolNotActiveList.get(0);
            poolActiveList.add(integer);
            poolNotActiveList.remove(integer);

            pooNotActiceSize--;
            pooAvticeSize++;
            return integer;
        }else{
            throw new RuntimeException("没有空闲的连接！");
        }
    }

    public static void closeConnection(Integer index){
        poolNotActiveList.add(index);
        poolActiveList.remove(index);
        pooNotActiceSize++;
        pooAvticeSize--;
    }

    public static void info(){
        System.out.println("poolSize:" + poolSize + "," + "pooAvticeSize:" + pooAvticeSize + "," + "pooNotActiceSize:" + pooNotActiceSize );
    }
}
