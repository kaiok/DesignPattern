package com.kais.designpattern.factoryabstractmode;

/**
 * @author Kais
 * @create 2021-08-09-16:36
 */

/*
* 抽象工厂模式
*   使用了产品族的概念
* 抽象模式组成：
*   抽象工厂（AbstractFactory）：描述具体工厂的公共接口
*   具体工厂（ConcreteFactory）：描述具体工厂，创建产品的实例，供外界调用
*   抽象产品（族）（AbstractProduct）：描述抽象产品的公共接口
*   具体产品（ConcreteProduct）：描述具体产品的公共接口
*
* 抽象工厂模式和工厂方法模式一样，都符合开闭原则。但是不同的是，
*       工厂方法模式在增加一个具体产品的时候，都要增加对应的工厂。
*       但是抽象工厂模式只有在新增一个类型的具体产品时才需要新增工厂
* 也就是说，工厂方法模式的一个工厂只能创建一个具体产品。而抽象工厂模式的一个工厂
* 可以创建属于一类类型的多种具体产品
* */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        AbstractCarFactory2 factory = new BydCarFactory();
        BusinessCar car = factory.productionBusinessCar();
        car.printInfo();
    }
}