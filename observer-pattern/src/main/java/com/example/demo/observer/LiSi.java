package com.example.demo.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName LiSi
 * @Description 观察者类，实现Observer接口
 * @Author xw
 * @Date 2018/5/9 10:50
 * @Version 1.0
 * @Modifier xw
 * @Modify Date 2018/5/9 10:50
 **/
public class LiSi implements Observer {

    Logger logger = LoggerFactory.getLogger(LiSi.class);

    /**
     * 观察者实现
     *
     * @param o
     * @param arg
     * @return
     * @author xw
     * @date 2018/5/9 10:55
     */
    @Override
    public void update(Observable o, Object arg) {
        logger.info("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQiShiHuang(arg.toString());
        logger.info("李斯：汇报完毕，秦老板赏给他两个萝卜吃吃...\n");
    }

    /**
     * 通知
     *
     * @param reportContext
     * @return
     * @author xw
     * @date 2018/5/9 10:55
     */
    private void reportToQiShiHuang(String reportContext){
        logger.info("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
    }
}
