package com.kk.test;

import com.kk.test.demo.Human;
import com.kk.test.demo.HumanEnum;
import com.kk.test.demo.HumanFactory;

/**
 * 测试
 *
 * @Author kk.xie
 * @Date 2019/10/9 13:52
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();
        Human human = humanFactory.getHuman(HumanEnum.YELLOW);

        human.name();
        human.say();
    }
}
