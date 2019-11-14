package com.example.demo.model;

/**
 * 模本方法
 *
 * @ClassName HummerModel
 * @CopyRright (c) 2018-bxm：杭州微财网络科技有限公司
 * @Author kk.xie
 * @Date 2018/6/26 16:50
 * @Version 1.0
 * @Modifier kk.xie
 * @Modify Date 2018/6/26 16:50
 **/
public abstract class HummerModel {
    /**
    * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正
    * 是要能够发动起来，那这个实现要在实现类里了
    */
    protected abstract void start();
    /**
     * 能发动，那还要能停下来，那才是真本事
     *
     * @param
     * @return void
     * @throws
     * @author kk.xie
     * @date 2018/6/26 16:51
     */
    protected abstract void stop();

    /**
     * 喇叭会出声音，是滴滴叫，还是哔哔叫
     *
     * @param
     * @return void
     * @throws
     * @author kk.xie
     * @date 2018/6/26 16:51
     */
    protected abstract void alarm();

    /**
     * 引擎会轰隆隆的响，不响那是假的
     *
     * @param
     * @return void
     * @throws
     * @author kk.xie
     * @date 2018/6/26 16:51
     */
    protected abstract void engineBoom();

    public final void run() {
        //先发动汽车
        this.start();
        //引擎开始轰鸣
        this.engineBoom();
        //然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
        this.alarm();
        //到达目的地就停车
        this.stop();
    }
}
