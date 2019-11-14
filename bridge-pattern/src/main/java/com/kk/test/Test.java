package com.kk.test;

import com.kk.test.demo.event.Event;
import com.kk.test.demo.ext.MyBlackEvent;
import com.kk.test.demo.ext.MyBlackListener;
import com.kk.test.demo.listen.BlackListener;
import com.kk.test.demo.listen.Listener;

/**
 * test
 *
 * @Author kk.xie
 * @Date 2019/10/11 16:43
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Listener listener = new BlackListener();
        listener.listen().event();


        Listener listener1 = new MyBlackListener();
        MyBlackEvent myBlackEvent = (MyBlackEvent)listener1.listen();
        myBlackEvent.event();
        myBlackEvent.say();
    }
}
