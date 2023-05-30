package com.kais.designpattern.factorymethod;

import com.kais.designpattern.factorysimplemode.BydCar;
import com.kais.designpattern.factorysimplemode.Car;

/**
 * @author Kais
 * @create 2021-08-09-16:09
 */
// 具体工厂（ConcreteFactory）,比亚迪汽车工厂
public class BydCarFactory extends AbstractCarFactory{


    @Override
    Car productionCar(){
        //通过抽象产品，new出产品实例，并返回
        return new BydCar();
    }

}