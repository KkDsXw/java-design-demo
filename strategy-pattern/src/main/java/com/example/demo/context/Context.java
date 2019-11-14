package com.example.demo.context;

import com.example.demo.strategy.IStrategy;

/**
 * 策略类
 *
 * @ClassName Context
 * @CopyRright (c) 2018-bxm：杭州微财网络科技有限公司
 * @Author kk.xie
 * @Date 2018/6/26 14:59
 * @Version 1.0
 * @Modifier kk.xie
 * @Modify Date 2018/6/26 14:59
 **/
public class Context {
    private IStrategy straegy;

    public Context(IStrategy strategy){
        this.straegy = strategy;
    }
    /**
     * 使用计谋了，看我出招了
     *
     * @param
     * @return void
     * @throws
     * @author kk.xie
     * @date 2018/6/26 15:00
     */
    public void operate(){
        this.straegy.operate();
    }
}
