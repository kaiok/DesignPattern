package com.kais.designpattern.adaptermode.adapterofinterface;

/**
 * @Author liuxiankai
 * @ClassName Adapter
 * @CreateTime 2021-09-07 15:15
 * @Description: 定义适配器角色，实现接口适配器操作
 * 1.一个抽象的电源，并且提供多个适配器角色的有参构造
 * 2.通过具体源角色的实例使用抽象的电源引用，适配器类实现于目标角色并实现目标角色的方法
 * 3.在方法体中，我们进行逻辑处理，将输入的电压进行适配为5V电压，从而达到万能适配的效果
 */
public class Adapter implements DC5V {

    private ACV acv;

    Adapter(AC220V ac220V) {
        this.acv = ac220V;
    }

    public Adapter(AC110V ac110V) {
        this.acv = ac110V;
    }

    @Override
    public int dc5v() {
        int ac = 0;
        if (acv != null) {
            ac = acv.output();
        }
        int sta = ac / 5;
        return (ac / sta);
    }
}