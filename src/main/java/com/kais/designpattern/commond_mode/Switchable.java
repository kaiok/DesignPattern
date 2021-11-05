package com.kais.designpattern.commond_mode;

/**
 * @Author liuxiankai
 * @ClassName Switchable
 * @CreateTime 2021-09-26 14:39
 * @Description: 模拟电灯通电断电行为的接口,电器接口
 */
public interface Switchable {
    //通电
    public void on();
    //断电
    public void off();

}
