package com.kais.designpattern.sigletonmode;

/**
 * @Author liuxiankai
 * @ClassName SingletonTest
 * @CreateTime 2021-08-30 15:35
 * @Description: 懒汉式单例模式测试
 */
public class SingletonTest {

    public static void main(String[] args) {

        President zt1 = President.getInstance();
        zt1.getName();    //输出总统的名字
        President zt2 = President.getInstance();
        zt2.getName();    //输出总统的名字
        if (zt1 == zt2) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
    }

}
