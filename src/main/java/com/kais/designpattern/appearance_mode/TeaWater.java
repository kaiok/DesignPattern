package com.kais.designpattern.appearance_mode;

/**
 * @Author liuxiankai
 * @ClassName TeaWater
 * @CreateTime 2021-09-26 11:21
 * @Description: 茶水信息
 */
class TeaWater {


    String mess;
    TeaWater teaWater;

    public TeaWater() {
    }

    TeaWater(String mess) {
        this.mess = mess;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public TeaWater getTeaWater() {
        return teaWater;
    }

    public void setTeaWater(TeaWater teaWater) {
        this.teaWater = teaWater;
    }
}
