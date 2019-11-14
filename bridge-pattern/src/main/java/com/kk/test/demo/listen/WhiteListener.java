package com.kk.test.demo.listen;

import com.kk.test.demo.event.WhiteEvent;

/**
 * 白 监听
 *
 * @Author kk.xie
 * @Date 2019/10/11 16:47
 * @Version 1.0
 **/
public class WhiteListener implements Listener<WhiteEvent> {


    @Override
    public WhiteEvent listen() {
        return new WhiteEvent();
    }
}
