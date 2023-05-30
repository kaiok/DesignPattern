package com.kais.designpattern.Decoratorpattern.nope;

/**
 * @Author liuxiankai
 * @ClassName BatterCakeWithSausageAndEggs
 * @CreateTime 2021-09-13 11:04
 * @Description: 加一个鸡蛋和一根香肠的煎饼
 */
public class BatterCakeWithSausageAndEggs extends BatterCake {

    @Override
    public String getYourBatterCake() {
        return super.getYourBatterCake() + "加一个香肠，和一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 3;
    }
}
