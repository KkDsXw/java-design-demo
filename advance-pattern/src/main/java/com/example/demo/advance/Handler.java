package com.example.demo.advance;

import com.example.demo.link.IWomen;

/**
 * 责任链顶层接口
 *
 * @ClassName Handler
 * @CopyRright (c) 2018-bxm：杭州微财网络科技有限公司
 * @Author kk.xie
 * @Date 2018/6/26 15:45
 * @Version 1.0
 * @Modifier kk.xie
 * @Modify Date 2018/6/26 15:45
 **/
public abstract class Handler {
    /**
     * 能处理的等级
     */
    private int level;

    /**
     * 下一个处理的责任实现类
     */
    private Handler nextHanlder;

    /**
     * 每个类都要说明一下自己能处理哪些请求
     *
     * @param level
     * @return
     * @throws
     * @author kk.xie
     * @date
     */
    public Handler(int level){
        this.level = level;
    }

    public final void handlerMessage(IWomen women){
        if(women.getType() == this.level){
            this.response(women);
        }else{
            if(this.nextHanlder != null){
                System.out.println("我无法回答你的请求，level:" + this.level + ", womenType:" + women.getType());
                nextHanlder.handlerMessage(women);
            }else{
                System.out.println("没有地方可以请示了···");
            }
        }
    }

    public void setNextHanlder(Handler nextHanlder) {
        this.nextHanlder = nextHanlder;
    }

    /**
     * 响应方法，由子类实现
     *
     * @param women
     * @return void
     * @throws
     * @author kk.xie
     * @date 2018/6/26 15:58
     */
    public abstract void response(IWomen women);
}
