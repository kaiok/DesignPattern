package com.kais.designpattern.commond_mode;

/**
 * @Author liuxiankai
 * @ClassName Client
 * @CreateTime 2021-09-26 14:46
 * @Description: 客户端
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("===客户端用【开关】操作电器===");
        Switcher switcher = new Switcher();

        //灯泡接入开关
        switcher.setSwitchable(new Bulb());
        switcher.buttonOnClick();
        switcher.buttonOffClick();
        //风扇接入开关
        switcher.setSwitchable(new Fan());
        switcher.buttonOnClick();
        switcher.buttonOffClick();
    }

}