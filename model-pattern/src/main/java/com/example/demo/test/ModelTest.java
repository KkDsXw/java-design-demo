package com.example.demo.test;

import com.example.demo.model.impl.HummerH1Model;
import com.example.demo.model.impl.HummerH2Model;

/**
 * 模板方法测试
 *
 * @ClassName ModelTest
 * @CopyRright (c) 2018-bxm：杭州微财网络科技有限公司
 * @Author kk.xie
 * @Date 2018/6/26 16:56
 * @Version 1.0
 * @Modifier kk.xie
 * @Modify Date 2018/6/26 16:56
 **/
public class ModelTest {
    public static void main(String[] args) {
        HummerH1Model hummerH1Model = new HummerH1Model();
        hummerH1Model.run();

        HummerH2Model hummerH2Model = new HummerH2Model();
        hummerH2Model.run();
    }
}
