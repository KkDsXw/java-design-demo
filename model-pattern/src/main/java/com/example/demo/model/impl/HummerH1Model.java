package com.example.demo.model.impl;

import com.example.demo.model.HummerModel;

/**
 * 模板方法实现类1
 *
 * @ClassName HummerH1Model
 * @CopyRright (c) 2018-bxm：杭州微财网络科技有限公司
 * @Author kk.xie
 * @Date 2018/6/26 16:53
 * @Version 1.0
 * @Modifier kk.xie
 * @Modify Date 2018/6/26 16:53
 **/
public class HummerH1Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("H1 start");
    }

    @Override
    protected void stop() {
        System.out.println("H1 stop");
    }

    @Override
    protected void alarm() {
        System.out.println("H1 alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H1 engineBoom");
    }
}
