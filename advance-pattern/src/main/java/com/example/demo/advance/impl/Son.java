package com.example.demo.advance.impl;

import com.example.demo.advance.Handler;
import com.example.demo.link.IWomen;

/**
 * 儿子
 *
 * @ClassName Son
 * @CopyRright (c) 2018-bxm：杭州微财网络科技有限公司
 * @Author kk.xie
 * @Date 2018/6/26 16:00
 * @Version 1.0
 * @Modifier kk.xie
 * @Modify Date 2018/6/26 16:00
 **/
public class Son extends Handler{
    public Son() {
        super(3);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
}
