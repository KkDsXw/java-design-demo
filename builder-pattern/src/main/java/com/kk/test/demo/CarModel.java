package com.kk.test.demo;

import com.kk.test.demo.contanct.CarStatusEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * 汽车模型
 *
 * @Author kk.xie
 * @Date 2019/10/11 16:10
 * @Version 1.0
 **/
public abstract class CarModel {

    private List<CarStatusEnum> seq = new ArrayList<>();

    /**
     * 启动
     *
     * @param
     * @return void
     * @throws
     * @author kk.xie
     * @date 2019/10/11 16:12
     */
    protected abstract void start();

    /**
     * 鸣笛
     *
     * @param
     * @return void
     * @throws
     * @author kk.xie
     * @date 2019/10/11 16:12
     */
    protected abstract void blow();

    /**
     * 加油
     *
     * @param
     * @return void
     * @throws
     * @author kk.xie
     * @date 2019/10/11 16:12
     */
    protected abstract void refuel();

    /**
     * 停止
     *
     * @param
     * @return void
     * @throws
     * @author kk.xie
     * @date 2019/10/11 16:12
     */
    protected abstract void stop();

    public List<CarStatusEnum> getSeq() {
        return seq;
    }

    public void setSeq(List<CarStatusEnum> seq) {
        this.seq = seq;
    }

    public void run(){
        for (CarStatusEnum carStatusEnum : seq) {
            if(CarStatusEnum.START.equals(carStatusEnum)){
                start();
            }else if(CarStatusEnum.BLOW.equals(carStatusEnum)){
                blow();
            }else if(CarStatusEnum.REFUEL.equals(carStatusEnum)){
                refuel();
            }else if(CarStatusEnum.STOP.equals(carStatusEnum)){
                stop();
            }

        }
    }
}
