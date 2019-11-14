package com.kk.test.demo.factory;

import com.kk.test.demo.base.Human;
import com.kk.test.demo.constant.HumanEnum;

/**
 * 女性工厂
 *
 * @Author kk.xie
 * @Date 2019/10/10 16:52
 * @Version 1.0
 **/
public class WomanHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createYellow() {
        return super.createHuman(HumanEnum.YELLOW_WOMAN);
    }

    @Override
    public Human createBlack() {
        return super.createHuman(HumanEnum.BLACK_WOMAN);
    }

    @Override
    public Human createWhite() {
        return super.createHuman(HumanEnum.WHITE_WOMAN);
    }
}
