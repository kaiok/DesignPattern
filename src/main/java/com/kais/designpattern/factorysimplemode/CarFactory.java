package com.kais.designpattern.factorysimplemode;

/**
 * 方法描述:工厂（Factory）： 负责实现创建所有实例的内部逻辑，并提供一个外界调用的方法，创建所需的产品对象
 * 1.简单工厂模式又叫静态工厂模式，由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类（继承自一个父类或接口）的实例
 *
 *
 * @返回值 :
 * @作者 : lxk
 * 时间:2021/9/15 9:29
*/
class CarFactory {
    /**
     * 方法描述:使用反射实现汽车工厂类
     * 1.Class类中的方法：
     *      getName方法可以打印出该类类型的类名称
     * 2.获取Class对象方法：
     *      （1）forName 方式获取Class对象,Class.forName(该类类型的类名称);
     *      （2）.class方法：直接通过类获取Class对象，Car.class
     * 3.利用反射机制创建对象
     *      .newInstance方法，使用反射创建对象
     *      这样，当我们需要添加新的车种时，就不需要更改工厂类，直接创建新的车类就可以了
     *
     *
     * @param c
     * @返回值 : com.kais.designpattern.factorysimplemode.Car
     * @作者 : lxk
     * 时间:2021/9/15 9:31
    */
    static Car productionCar(Class c){
        Car car = null;
        try {
            //car = (Car) Class.forName(c.getName()).newInstance();
            Class aClass = Class.forName(c.getName());
            car = (Car) aClass.newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return car;
    }

}
