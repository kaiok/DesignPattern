package com.kais.designpattern.commond_mode;

/**
 * @Author liuxiankai
 * @ClassName Bulb
 * @CreateTime 2021-09-26 14:56
 * @Description: 具体的灯泡实现类，通电亮，断电灭
 */
public class Bulb implements Switchable {

    @Override
    public void on(){
        System.out.println("通电，灯亮。");
    }

    @Override
    public void off(){
        System.out.println("断电，灯灭。");
    }

}