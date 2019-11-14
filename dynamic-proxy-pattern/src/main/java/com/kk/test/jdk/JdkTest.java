package com.kk.test.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK代理测试
 *
 * @Author kk.xie
 * @Date 2019/11/13 16:09
 * @Version 1.0
 **/
public class JdkTest {
    public static void main(String[] args) {
        JdkMediaProxy media = new JdkMediaProxy(new JdkMan());
        Person instance = (Person)media.getInstance();
        System.out.println(instance.getClass());
        instance.buy();
        instance.love();
        System.out.println(instance);

        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{JdkMan.class});
            FileOutputStream os = new FileOutputStream("E:\\githubProject\\design-demo\\dynamic-proxy-pattern\\src\\main\\java\\com\\kk\\test\\jdk\\$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
