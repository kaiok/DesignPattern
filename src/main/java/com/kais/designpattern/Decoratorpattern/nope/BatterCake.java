package com.kais.designpattern.Decoratorpattern.nope;

/**
 * @Author liuxiankai
 * @ClassName BatterCake
 * @CreateTime 2021-09-13 10:52
 * @Description: 问题描述：一个煎饼8元、一个鸡蛋1元、一根香肠2元，写一个收银小程序，煎饼类
 * 1.未使用到装饰者模式
 * 2.当顾客需要加多个鸡蛋或者多根香肠时，类的个数便会变得很多了，不利于开发
 */
public class BatterCake {

    protected String getYourBatterCake(){

        return "您要的煎饼！";

    }

    protected int cost(){

        return 8;

    }

}
