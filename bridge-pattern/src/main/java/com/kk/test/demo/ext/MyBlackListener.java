package com.kk.test.demo.ext;

import com.kk.test.demo.listen.Listener;

/**
 * 扩展 监听
 *
 * @Author kk.xie
 * @Date 2019/10/11 16:57
 * @Version 1.0
 **/
public class MyBlackListener implements Listener<MyBlackEvent> {
    @Override
    public MyBlackEvent listen() {
        return new MyBlackEvent();
    }
}
