package com.kais.designpattern.bridgemode;

/**
 * @Author liuxiankai
 * @ClassName LargeCoffee
 * @CreateTime 2021-09-02 15:07
 * @Description: 抽象化角色实现类，大杯coffee
 */
class LargeCoffee extends RefinedCoffee{

    LargeCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    @Override
    void orderCoffee(int count) {
        additives.addSomething();
        System.out.println("来" + count + "份大杯咖啡");
    }
}
