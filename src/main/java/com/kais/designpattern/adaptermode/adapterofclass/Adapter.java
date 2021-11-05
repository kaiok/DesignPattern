package com.kais.designpattern.adaptermode.adapterofclass;

/**
 * @Author liuxiankai
 * @ClassName Adapter
 * @CreateTime 2021-09-07 14:21
 * @Description: 适配器类，将220V电压转换为5V电压，适用于手机等电器使用
 * 1.继承于原角色，实现于目标角色
 * 2.通过目标角色中的方法，调用原角色中的方法，输出想要的值（适配过程）
 * 3.由于Java仅支持单继承，所以使用一个继承一个接口进行实验
 */
public class Adapter extends AC220V implements DC5V {
    @Override
    public int dc5v() {
        int output220V = output220V();
        return (output220V / 44);
    }
}
