package com.kais.designpattern.commond_mode;

/**
 * @Author liuxiankai
 * @ClassName Switcher
 * @CreateTime 2021-09-26 14:41
 * @Description: 开关控制
 * 开关就类似一个控制器了，有“开”和“关”两个按键分别绑定了设备的“通电”与“断电”行为方法
 */
class Switcher {

    // 此开关与灯耦合，无法替换为其他电器。
    // private Bulb bulb = new Bulb();

    // 此开关与电器接口耦合，可任意替换电器
    private Switchable switchable;

    // 替换电器方法
    void setSwitchable(Switchable switchable) {
        this.switchable = switchable;
    }

    // 按键事件绑定

    //按钮“开”按下
    void buttonOnClick() {
        System.out.println("按下开……");
        switchable.on();
    }

    //按钮“关”按下
    void buttonOffClick() {
        System.out.println("按下关……");
        switchable.off();
    }

}
