package com.kais.designpattern.factorymethod;

import com.kais.designpattern.factorysimplemode.Car;

/**
 * @author Kais
 * @create 2021-08-09-16:07
 */

/*
* 工厂方法模式：
* 需要生产什么品牌的汽车，就要交给具体的工厂
* 工厂方法模式在增加一个具体产品的时候，要增加对应的工厂
*
* 在简单工厂模式中，工厂负责所有产品的生产，就像上面例子中，
* 一个汽车工厂负责所有汽车的生产。而工厂方法模式则是将工厂类抽象化，
* 把生成具体产品的任务分发给继承抽象方法的具体的产品工厂
*
* 组成：
*   1.抽象工厂（Abstract Factory）：描述具体工厂的公共接口
*   2.具体工厂（ConcreteFactory）：描述具体工厂，创建产品的实例，供外界调用
*   3.抽象产品（Product）：负责描述产品的公共接口
*   4.具体产品（ConcreteProduct）：描述生产的具体产品
* */

// 抽象汽车工厂类
public abstract class AbstractCarFactory {
    // 生产汽车
    abstract Car productionCar();
}