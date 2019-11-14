package com.example.demo.test;

import com.example.demo.advance.Handler;
import com.example.demo.advance.impl.Father;
import com.example.demo.advance.impl.Husband;
import com.example.demo.advance.impl.Son;
import com.example.demo.link.IWomen;
import com.example.demo.link.impl.WomenImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 责任链测试类
 *
 * @ClassName AdvanceTest
 * @CopyRright (c) 2018-bxm：杭州微财网络科技有限公司
 * @Author kk.xie
 * @Date 2018/6/26 16:05
 * @Version 1.0
 * @Modifier kk.xie
 * @Modify Date 2018/6/26 16:05
 **/
public class AdvanceTest {
    public static void main(String[] args) {
        Random rand = new Random();
        List<IWomen> arrayList = new ArrayList();
        for(int i=0;i<5;i++){
            arrayList.add(new WomenImpl(rand.nextInt(4),"我要出去逛街"));
        }

        //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNextHanlder(husband);
        husband.setNextHanlder(son);
        for(IWomen women:arrayList){
            father.handlerMessage(women);
        }
    }
}
