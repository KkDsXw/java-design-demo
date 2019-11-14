package com.kk.test.demo.build;

import com.kk.test.demo.BencCar;
import com.kk.test.demo.BmwCar;
import com.kk.test.demo.CarModel;
import com.kk.test.demo.contanct.CarStatusEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * 汽车建造者
 *
 * @Author kk.xie
 * @Date 2019/10/11 16:19
 * @Version 1.0
 **/
public class CarBuild {
    public CarModel buildBmw(List<CarStatusEnum> seq){
        BmwCar bmwCar = new BmwCar();
        bmwCar.setSeq(seq);
        return bmwCar;
    }

    public CarModel buildBmw2(){
        BmwCar bmwCar = new BmwCar();
        List<CarStatusEnum> seq = new ArrayList<>();
        seq.add(CarStatusEnum.START);
        seq.add(CarStatusEnum.STOP);
        bmwCar.setSeq(seq);
        return bmwCar;
    }

    public CarModel buildBenc(List<CarStatusEnum> seq){
        BencCar bencCar = new BencCar();
        bencCar.setSeq(seq);
        return bencCar;
    }

    public CarModel buildBenc2(){
        BencCar bencCar = new BencCar();
        List<CarStatusEnum> seq = new ArrayList<>();
        seq.add(CarStatusEnum.START);
        seq.add(CarStatusEnum.BLOW);
        seq.add(CarStatusEnum.STOP);
        bencCar.setSeq(seq);
        return bencCar;
    }
}
