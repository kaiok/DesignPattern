package com.kais.designpattern.adaptermode.adapterofclass;

/**
 * @Author liuxiankai
 * @ClassName ClassTest
 * @CreateTime 2021-09-07 14:24
 * @Description: 类适配器模式测试类
 */
public class ClassTest {

    public static void main(String[] args) {

        //适配器起到中转的作用
        //使得目标角色的API可以调用原角色的API
        DC5V dc5V = new Adapter();
        int adapterResult = dc5V.dc5v();
        System.out.println("适配器调整后的电压为：" + adapterResult);
    }

}
