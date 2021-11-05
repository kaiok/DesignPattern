package com.kais.designpattern.Decoratorpattern.nope;

/**
 * @Author liuxiankai
 * @ClassName BattercakeWithEggs
 * @CreateTime 2021-09-13 10:56
 * @Description: 加鸡蛋的煎饼
 */
class BatterCakeWithEggs extends BatterCake {

    @Override
    public String getYourBatterCake() {
        return super.getYourBatterCake() + "加上一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
