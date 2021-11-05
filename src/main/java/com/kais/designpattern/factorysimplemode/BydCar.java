package com.kais.designpattern.factorysimplemode;

/**
 * @author Kais
 * @create 2021-08-09-15:28
 */

/**
 * 方法描述:具体产品（ConcreteProduct）： 描述生产的具体产品
 *
 * @param null
 * @返回值 :
 * @作者 : lxk
 * 时间:2021/9/15 9:29
*/
public class BydCar extends Car {
    @Override
    public void printInfo() {
        System.out.println("这是比亚迪汽车");
    }
}
