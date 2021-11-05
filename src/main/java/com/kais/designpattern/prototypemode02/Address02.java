package com.kais.designpattern.prototypemode02;

/**
 * @author Kais
 * @create 2021-07-20-10:34
 */
public class Address02 implements Cloneable {
    private String province;
    private String city;

    @Override
    public Object clone() {

        Address02 address = null;
        try {
            address = (Address02) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return address;
    }

    Address02(String province, String city) {
        this.province = province;
        this.city = city;
    }

    String getProvince() {
        return province;
    }

    void setProvince(String province) {
        this.province = province;
    }

    String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}