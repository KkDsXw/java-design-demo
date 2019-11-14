package com.kk.test.demo.listen;

import com.kk.test.demo.event.Event;

/**
 * 监听
 *
 * @Author kk.xie
 * @Date 2019/10/11 16:43
 * @Version 1.0
 **/
public interface Listener<T extends Event> {
    T listen();
}
