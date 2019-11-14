package com.kk.test.demo;

/**
 * 适配接口
 *
 * @Author kk.xie
 * @Date 2019/10/10 17:43
 * @Version 1.0
 **/
public interface IUser {
    /**
     * 名称
     *
     * @param
     * @return java.lang.String
     * @throws
     * @author kk.xie
     * @date 2019/10/10 17:44
     */
    String name();

    /**
     * 编码
     *
     * @param
     * @return java.lang.String
     * @throws
     * @author kk.xie
     * @date 2019/10/10 17:44
     */
    String code();

    /**
     * 报文
     *
     * @param
     * @return java.lang.String
     * @throws
     * @author kk.xie
     * @date 2019/10/10 17:44
     */
    String context();
}
