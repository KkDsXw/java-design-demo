package com.example.demo.test;

import com.example.demo.observer.HanFeiZi;
import com.example.demo.observer.LiSi;
import com.example.demo.observer.LiuSi;
import com.example.demo.observer.WangSi;

import java.util.Observer;

/**
 * 观察者模式测试类
 *
 * @Author kk.xie
 * @Date 2019/6/13 16:30
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        //三个观察者产生出来
        Observer wangSi = new WangSi();
        Observer liSi = new LiSi();
        Observer liuSi = new LiuSi();
        //定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        //我们后人根据历史，描述这个场景，有三个人在观察韩非子
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);
        //然后这里我们看看韩非子在干什么
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
