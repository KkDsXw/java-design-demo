package com.example.demo.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;

/**
 * @ClassName HanFeiZi
 * @Description 被观察者类，继承 Observable类-被观察者 ， Observable类实现观察者Observer集合增删
 * @Author xw
 * @Date 2018/5/9 10:44
 * @Version 1.0
 * @Modifier xw
 * @Modify Date 2018/5/9 10:44
 **/
public class HanFeiZi extends Observable {

    Logger logger = LoggerFactory.getLogger(HanFeiZi.class);
    /**
     * 韩非子要吃饭了
     *
     * @param
     * @return
     * @author xw
     * @date 2018/5/9 10:45
     */
    public void haveBreakfast(){
        logger.info("韩非子:开始吃饭了...");
        //通知所有的观察者
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    /**
     * 韩非子开始娱乐了,古代人没啥娱乐，你能想到的就那么多
     *
     * @param
     * @return
     * @author xw
     * @date 2018/5/9 10:45
     */
    public void haveFun(){
        logger.info("韩非子:开始娱乐了...");
        super.setChanged();
        this.notifyObservers("韩非子在娱乐");
    }
}
