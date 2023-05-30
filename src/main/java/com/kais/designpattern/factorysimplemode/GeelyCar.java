package com.kais.designpattern.factorysimplemode;

/**
 * @author Kais
 * @create 2021-08-09-15:29
 */

/**
 * 方法描述:具体产品（ConcreteProduct）： 描述生产的具体产品
 *
 * @author Kais
 * @param
 * @返回值 :
 * @作者 : lxk
 * 时间:2021/9/15 9:26
*/
public class GeelyCar extends Car{
    @Override
    public void printInfo() {
        System.out.println("这是吉利汽车");
    }
}
