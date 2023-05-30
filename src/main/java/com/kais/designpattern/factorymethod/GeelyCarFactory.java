package com.kais.designpattern.factorymethod;

import com.kais.designpattern.factorysimplemode.Car;
import com.kais.designpattern.factorysimplemode.GeelyCar;

/**
 * @author Kais
 * @create 2021-08-09-16:10
 */

// 吉利汽车工厂
public class GeelyCarFactory extends AbstractCarFactory{

    @Override
    Car productionCar(){
        return new GeelyCar();
    }

}