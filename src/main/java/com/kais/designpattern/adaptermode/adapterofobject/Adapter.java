package com.kais.designpattern.adaptermode.adapterofobject;

import com.kais.designpattern.adaptermode.adapterofclass.AC220V;
import com.kais.designpattern.adaptermode.adapterofclass.DC5V;

/**
 * @Author liuxiankai
 * @ClassName Adapter
 * @CreateTime 2021-09-07 14:40
 * @Description: 对象适配器模式
 * 1.原角色与目标角色实现与类适配器模式相同
 * 2.对象适配器拥有原角色实例，通过组合的方式实现适配器功能（通过对象的引用实现适配器的转换）
 */
public class Adapter implements DC5V {

    /**
     * 方法描述:原角色实例
     * 时间:2021/9/7 15:03
    */
    private AC220V ac220V;

    Adapter(AC220V ac220V) {
        this.ac220V = ac220V;
    }

    @Override
    public int dc5v() {
        int output220v = ac220V.output220V();
        return (output220v / 44);
    }

}
