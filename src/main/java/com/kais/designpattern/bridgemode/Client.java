package com.kais.designpattern.bridgemode;

/**
 * @Author liuxiankai
 * @ClassName Client
 * @CreateTime 2021-09-02 14:48
 * @Description: 客户端，客户点单
 */
public class Client {

    public static void main(String[] args) {
        //点两杯加奶的大杯咖啡
        RefinedCoffee largeWithMilk=new LargeCoffee(new Milk());
        largeWithMilk.orderCoffee(2);
        largeWithMilk.checkQuality();
    }

}
