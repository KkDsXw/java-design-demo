package com.kk.test.demo;

/**
 * 找人工厂
 *
 * @Author kk.xie
 * @Date 2019/10/10 16:05
 * @Version 1.0
 **/
public class HumanFactory {
    public Human getHuman(HumanEnum humanEnum){
        if(HumanEnum.BLACK.equals(humanEnum)){
            return new BlackHuman();
        }else if(HumanEnum.WHITE.equals(humanEnum)) {
            return new WhiteHuman();
        }else if(HumanEnum.YELLOW.equals(humanEnum)) {
            return new YellowHuman();
        }

        return null;
    }
}
