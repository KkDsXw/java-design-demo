package com.kk.test.demo.factory;

import com.kk.test.demo.base.Human;

/**
 * 造人工厂
 *
 * @Author kk.xie
 * @Date 2019/10/10 16:40
 * @Version 1.0
 **/
public interface HumanFactory {
    /**
     * 创建黄种人
     *
     * @param
     * @return com.kk.test.demo.base.Human
     * @throws
     * @author kk.xie
     * @date 2019/10/10 16:42
     */
    Human createYellow();

    /**
     * 创建黑人
     *
     * @param
     * @return com.kk.test.demo.base.Human
     * @throws
     * @author kk.xie
     * @date 2019/10/10 16:42
     */
    Human createBlack();

    /**
     * 创建白人
     *
     * @param
     * @return com.kk.test.demo.base.Human
     * @throws
     * @author kk.xie
     * @date 2019/10/10 16:43
     */
    Human createWhite();
}
