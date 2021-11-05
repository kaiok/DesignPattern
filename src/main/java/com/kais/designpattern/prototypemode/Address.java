package com.kais.designpattern.prototypemode;

/**
 * @author Kais
 * @create 2021-07-20-0:24
 */
public class Address {

    /**
     * province：省份
     * city：市
     */
    private String province;
    private String city;

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
