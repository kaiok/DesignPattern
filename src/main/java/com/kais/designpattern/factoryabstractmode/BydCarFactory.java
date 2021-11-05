package com.kais.designpattern.factoryabstractmode;

/**
 * @author Kais
 * @create 2021-08-09-16:32
 */
// 比亚迪汽车工厂
public class BydCarFactory extends AbstractCarFactory2 {

    @Override
    public BusinessCar productionBusinessCar() {
        return new BydBusinessCar();
    }

    @Override
    public SportCar productionSportCar() {
        return new BydSportCar();
    }

}