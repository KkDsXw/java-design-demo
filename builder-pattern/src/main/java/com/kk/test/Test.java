package com.kk.test;

import com.kk.test.demo.CarModel;
import com.kk.test.demo.build.CarBuild;
import com.kk.test.demo.contanct.CarStatusEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * test
 *
 * @Author kk.xie
 * @Date 2019/10/11 15:56
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        CarBuild carBuild = new CarBuild();
        CarModel carModel = carBuild.buildBmw2();
        carModel.run();

        CarModel carModel1 = carBuild.buildBenc2();
        carModel1.run();

        List<CarStatusEnum> seq = new ArrayList<>();
        seq.add(CarStatusEnum.START);
        seq.add(CarStatusEnum.BLOW);
        CarModel carModel2 = carBuild.buildBmw(seq);
        carModel2.run();
    }
}
