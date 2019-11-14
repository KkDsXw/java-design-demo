package com.example.demo.test;

import com.example.demo.context.Context;
import com.example.demo.strategy.impl.StrategyBackDoorImpl;
import com.example.demo.strategy.impl.StrategyGivenGreenLightImpl;

/**
 * 策略模式测试类
 *
 * @ClassName ContextTest
 * @CopyRright (c) 2018-bxm：杭州微财网络科技有限公司
 * @Author kk.xie
 * @Date 2018/6/26 15:01
 * @Version 1.0
 * @Modifier kk.xie
 * @Modify Date 2018/6/26 15:01
 **/
public class ContextTest {
    public static void main(String[] args) {
        Context context;
        //刚刚到吴国的时候拆第一个
        System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
        context = new Context(new StrategyBackDoorImpl());
        context.operate();
        System.out.println("\n\n");
        //刘备乐不思蜀了，拆第二个了
        System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
        context = new Context(new StrategyGivenGreenLightImpl());
        context.operate();
        System.out.println("\n\n");
    }
}
