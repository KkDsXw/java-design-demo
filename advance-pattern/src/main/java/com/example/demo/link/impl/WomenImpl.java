package com.example.demo.link.impl;

import com.example.demo.link.IWomen;

/**
 * 妇女类
 *
 * @ClassName WomenImpl
 * @CopyRright (c) 2018-bxm：杭州微财网络科技有限公司
 * @Author kk.xie
 * @Date 2018/6/26 15:51
 * @Version 1.0
 * @Modifier kk.xie
 * @Modify Date 2018/6/26 15:51
 **/
public class WomenImpl implements IWomen{

    private int type;
    private String request;

    public WomenImpl(int type, String request) {
        this.type = type;

        switch(this.type) {
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
                break;
            default:
                this.request = request;
        }
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getRequest() {
        return request;
    }
}
