package com.kk.test.demo;

/**
 * 写信
 *
 * @Author kk.xie
 * @Date 2019/10/10 17:28
 * @Version 1.0
 **/
public class LetterProcessImpl implements LetterProcess{
    @Override
    public void writeContext(String context) {
        System.out.println("写信"+context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("写信封"+address);
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("投入邮箱");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄");
    }
}
