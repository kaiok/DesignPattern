package com.kais.designpattern.adaptermode.adapterofinterface;

/**
 * @Author liuxiankai
 * @ClassName InterfaceTest
 * @CreateTime 2021-09-07 15:16
 * @Description: 接口适配器实现测试类
 */
public class InterfaceTest {

    public static void main(String[] args) {

        DC5V dc5V = new Adapter(new AC220V());
        int dc = dc5V.dc5v();
        System.out.println("输入的电压为：" + new AC220V().output() + " 伏...");
        System.out.println("转换后的电压为：" + dc + " 伏...");

    }

}
