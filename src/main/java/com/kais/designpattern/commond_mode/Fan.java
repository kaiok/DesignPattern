package com.kais.designpattern.commond_mode;

/**
 * @Author liuxiankai
 * @ClassName Fan
 * @CreateTime 2021-09-26 14:59
 * @Description: 具体风扇实现类，风扇是通电转，断电停
 */
public class Fan implements Switchable{

    @Override
    public void on() {
        System.out.println("通电，风扇转动。");
    }

    @Override
    public void off() {
        System.out.println("断电，风扇停止。");
    }

}
