package com.kais.designpattern.Decoratorpattern.nope;

/**
 * @Author liuxiankai
 * @ClassName BatterCakeWithSausage
 * @CreateTime 2021-09-13 11:02
 * @Description: 加香肠的东北杂粮煎饼
 */
public class BatterCakeWithSausage extends BatterCake {

    @Override
    public String getYourBatterCake() {
        return super.getYourBatterCake() + "加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
