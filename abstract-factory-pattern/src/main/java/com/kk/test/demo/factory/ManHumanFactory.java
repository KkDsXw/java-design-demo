package com.kk.test.demo.factory;

import com.kk.test.demo.base.Human;
import com.kk.test.demo.constant.HumanEnum;

/**
 * 男性工程
 *
 * @Author kk.xie
 * @Date 2019/10/10 16:52
 * @Version 1.0
 **/
public class ManHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createYellow() {
        return super.createHuman(HumanEnum.YELLOW_MAN);
    }

    @Override
    public Human createBlack() {
        return super.createHuman(HumanEnum.BLACK_MAN);
    }

    @Override
    public Human createWhite() {
        return super.createHuman(HumanEnum.WHITE_MAN);
    }
}
