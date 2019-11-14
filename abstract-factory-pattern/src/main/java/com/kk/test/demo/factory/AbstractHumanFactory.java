package com.kk.test.demo.factory;

import com.kk.test.demo.base.Human;
import com.kk.test.demo.constant.HumanEnum;
import com.kk.test.demo.pojo.*;

/**
 * 找人抽象工厂
 *
 * @Author kk.xie
 * @Date 2019/10/10 16:43
 * @Version 1.0
 **/
public abstract class AbstractHumanFactory implements HumanFactory {

    protected Human createHuman(HumanEnum humanEnum){
        if(HumanEnum.BLACK_MAN.equals(humanEnum)){
            return new BlackManHuman();
        }else if(HumanEnum.BLACK_WOMAN.equals(humanEnum)){
            return new BlackWomenHuman();
        }else if(HumanEnum.WHITE_MAN.equals(humanEnum)){
            return new WhiteManHuman();
        }else if(HumanEnum.WHITE_WOMAN.equals(humanEnum)){
            return new WhiteWomenHuman();
        }else if(HumanEnum.YELLOW_MAN.equals(humanEnum)){
            return new YellowManHuman();
        }else if(HumanEnum.YELLOW_WOMAN.equals(humanEnum)){
            return new YellowWomenHuman();
        }
        return null;
    }
}
