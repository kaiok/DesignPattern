package com.kais.designpattern.adaptermode.adapterofinterface;

/**
 * @Author liuxiankai
 * @ClassName ACV
 * @CreateTime 2021-09-07 15:08
 * @Description: 定义抽象电源类
 */
public abstract class ACV {

    /**
     * 方法描述:默认电源为220V
     *
     * @返回值 : int
     * @作者 : lxk
     * 时间:2021/9/7 15:09
    */
    public int output(){
        return 200;
    }

}
