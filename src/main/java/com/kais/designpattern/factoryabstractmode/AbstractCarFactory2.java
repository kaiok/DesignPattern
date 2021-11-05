package com.kais.designpattern.factoryabstractmode;

/**
 * @author Kais
 * @create 2021-08-09-16:32
 */
// 抽象汽车工厂类
public abstract class AbstractCarFactory2 {
    // 生产商务汽车
    abstract BusinessCar productionBusinessCar();
    // 生产运动汽车
    abstract SportCar productionSportCar();
}
