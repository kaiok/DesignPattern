package com.kais.designpattern.factoryabstractmode;

/**
 * @author Kais
 * @create 2021-08-09-16:36
 */
// 吉利汽车工厂
public class GeelyCarFactory extends AbstractCarFactory2 {
    @Override
    public BusinessCar productionBusinessCar() {
        return new GeelyBusinessCar();
    }

    @Override
    public SportCar productionSportCar() {
        return new GeelySportCar();
    }
}
