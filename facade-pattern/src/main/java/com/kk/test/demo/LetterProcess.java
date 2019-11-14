package com.kk.test.demo;

/**
 * 写信
 *
 * @Author kk.xie
 * @Date 2019/10/10 17:26
 * @Version 1.0
 **/
public interface LetterProcess {
    /**
     * 首先要写信的内容
     *
     * @param context
     * @return void
     * @throws
     * @author kk.xie
     * @date 2019/10/10 17:27
     */
    void writeContext(String context);
    /**
     * 其次写信封
     *
     * @param address
     * @return void
     * @throws
     * @author kk.xie
     * @date 2019/10/10 17:27
     */
    void fillEnvelope(String address);
    /**
     * 把信放到信封里
     *
     * @param
     * @return void
     * @throws
     * @author kk.xie
     * @date 2019/10/10 17:28
     */
    void letterInotoEnvelope();
    /**
     * 把信放到信封里
     *
     * @return
     * @throws
     * @author kk.xie
     * @date 2019/10/10 17:28
     */
    void sendLetter();
}
