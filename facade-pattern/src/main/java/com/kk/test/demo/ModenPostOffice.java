package com.kk.test.demo;

/**
 * 门面类
 *
 * @Author kk.xie
 * @Date 2019/10/10 17:30
 * @Version 1.0
 **/
public class ModenPostOffice {

    private LetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String adress){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(adress);
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}
