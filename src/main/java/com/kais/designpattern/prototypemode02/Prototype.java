package com.kais.designpattern.prototypemode02;

/**
 * @author Kais
 * @create 2021-07-20-10:34
 */
public class Prototype implements Cloneable {
    private String name;
    private Address02 address;

    Prototype(String name) {
        this.name = name;
    }

    Address02 getAddress() {
        return address;
    }

    void setAddress(Address02 address) {
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
        Prototype proto = (Prototype) super.clone();
        proto.address=(Address02) address.clone();
        return proto;
    }
}