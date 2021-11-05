package com.kais.designpattern.bridgemode;

import java.util.Random;

/**
 * @Author liuxiankai
 * @ClassName RefinedCoffee
 * @CreateTime 2021-09-02 14:45
 * @Description: 对抽象化类Coffee进行修正的一个类，作用：扩展抽象化角色，改变和修正父类对抽象化的定义
 */
abstract class RefinedCoffee extends Coffee {
    /**
     * 方法描述:抽象化类中有实现化类中的引用
     *
     * 时间:2021/9/2 15:10
    */
    RefinedCoffee(ICoffeeAdditives additives) {
        super(additives);
    }
    void checkQuality(){
        Random ran=new Random();
        System.out.println("additives.getClass() = " + additives.getClass());
        System.out.println("additives.getClass().getSimpleName() = " + additives.getClass().getSimpleName());
        System.out.println(String.format("%s 添加%s",additives.getClass().getSimpleName(),ran.nextBoolean()?"太多":"正常"));
    }
}