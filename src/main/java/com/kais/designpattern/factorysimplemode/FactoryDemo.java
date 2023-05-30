package com.kais.designpattern.factorysimplemode;

/**
 * 方法描述:
 *
 * @param
 * @返回值 :
 * @作者 : lxk
 * 时间:2021/9/15 9:38
*/
public class FactoryDemo {

    public static void main(String[] args) {
        /*
        * 任何一个类都是Class类的实例化对象
        * Class c1=F.class;//这种表达方式同时也告诉了我们任何一个类都有一个隐含的静态成员变量class
        * 此时productionCar方法的参数为Class对象类型（反射）
        * */
        Car car = CarFactory.productionCar(BydCar.class);
        car.printInfo();
        Car car1 = CarFactory.productionCar(GeelyCar.class);
        car1.printInfo();
    }

}
