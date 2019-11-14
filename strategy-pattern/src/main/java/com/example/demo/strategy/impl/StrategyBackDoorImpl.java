package com.example.demo.strategy.impl;

import com.example.demo.strategy.IStrategy;

/**
 * 策略实现类-找乔国老帮忙，使孙权不能杀刘备
 *
 * @ClassName StrategyBackDoorImpl
 * @CopyRright (c) 2018-bxm：杭州微财网络科技有限公司
 * @Author kk.xie
 * @Date 2018/6/26 14:57
 * @Version 1.0
 * @Modifier kk.xie
 * @Modify Date 2018/6/26 14:57
 **/
public class StrategyBackDoorImpl implements IStrategy{
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
