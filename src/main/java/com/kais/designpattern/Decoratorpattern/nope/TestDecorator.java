package com.kais.designpattern.Decoratorpattern.nope;

/**
 * @Author liuxiankai
 * @ClassName TestDecorator
 * @CreateTime 2021-09-13 11:06
 * @Description: 不适用装饰者模式实现的方式
 */
public class TestDecorator {

    public static void main(String[] args) {

        BatterCake batterCake =  new BatterCake();
        System.out.println(batterCake.getYourBatterCake() + batterCake.cost() + "元");

        //加一个鸡蛋的煎饼
        BatterCake batterCakeWithEggs = new BatterCakeWithEggs();
        System.out.println(batterCakeWithEggs.getYourBatterCake() + batterCakeWithEggs.cost() + "元");

        BatterCake batterCakeWithSausage = new BatterCakeWithSausage();
        System.out.println(batterCakeWithSausage.getYourBatterCake() + batterCakeWithSausage.cost() + "元");



    }

}
