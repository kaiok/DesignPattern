package com.kais.designpattern.bridgemode;

/**
 * @Author liuxiankai
 * @ClassName Coffee
 * @CreateTime 2021-09-02 14:44
 * @Description: 抽象化部分，咖啡容量抽象化，咖啡口味(additives：添加剂)实现化类
 */
abstract class Coffee {
    /**
     * 方法描述:保存一个对实现化对象的引用
     * Coffee持有了ICoffeeAdditives 引用，ICoffeeAdditives 的实例是通过构造函数注入的，
     * 这个过程就是我们所说的桥接过程。我们通过这个引用就可以调用ICoffeeAdditives的方法，
     * 进而将Coffee的行为与ICoffeeAdditives的行为通过orderCoffee()方法而组合起来
    */
    ICoffeeAdditives additives;
    Coffee(ICoffeeAdditives additives){
        this.additives=additives;
    }
    /**
     * 方法描述:订单数量
     * 时间:2021/9/2 15:00
    */
    abstract void orderCoffee(int count);

}
