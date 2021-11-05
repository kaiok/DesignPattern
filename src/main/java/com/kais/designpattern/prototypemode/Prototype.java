package com.kais.designpattern.prototypemode;

/**
 * @author Kais
 * @create 2021-07-20-0:26
 * 具体原型类:实现抽象原型类的 clone() 方法，它是可被复制的对象
 * 抽象原型类：Cloneable 接口
 */
public class Prototype implements Cloneable {
    private String name;
    private Address address;

    Prototype(String name) {
        this.name = name;
    }

    Address getAddress() {
        return address;
    }

    void setAddress(Address address) {
        this.address = address;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

}
