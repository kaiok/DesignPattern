package com.kais.designpattern.factoryabstractmode;

/**
 * @author Kais
 * @create 2021-08-09-16:30
 */
// 比亚迪商务汽车
public class BydBusinessCar extends BusinessCar{
    @Override
    public void printInfo() {
        System.out.println("这是比亚迪商务汽车");
    }
}