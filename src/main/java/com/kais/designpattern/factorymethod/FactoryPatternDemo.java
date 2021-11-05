package com.kais.designpattern.factorymethod;

import com.kais.designpattern.factorysimplemode.Car;

/**
 * @author Kais
 * @create 2021-08-09-16:11
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        AbstractCarFactory factory = new BydCarFactory();
        Car car = factory.productionCar();
        car.printInfo();
    }
}
