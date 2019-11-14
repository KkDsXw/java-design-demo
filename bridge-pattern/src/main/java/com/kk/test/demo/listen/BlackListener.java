package com.kk.test.demo.listen;

import com.kk.test.demo.event.BlackEvent;

/**
 * 黑 监听
 *
 * @Author kk.xie
 * @Date 2019/10/11 16:47
 * @Version 1.0
 **/
public class BlackListener implements Listener<BlackEvent> {

    @Override
    public BlackEvent listen() {
        return new BlackEvent();
    }
}
