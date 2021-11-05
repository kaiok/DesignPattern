package com.kais.designpattern.proxy;

/**
 * @author Kais
 * @create 2021-07-21-14:29
 */


/*
* 静态代理：需要定义接口或者父类，被代理对象与代理对象一起实现相同的接口或者继承相同父类
*
* 缺点：
*   因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,
* 一旦接口增加方法,目标对象与代理对象都要维护
* */
public class PorxyTest {

    public static void main(String[] args) {

        //目标对象，主体还是我们的目标对象
        UserDao target = new UserDao();

        //代理对象，把目标对象传给代理对象，建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);
        //执行代理方法，进行操作
        proxy.save();

    }

}
