package com.kais.designpattern.adaptermode.adapterofinterface;

/**
 * @Author liuxiankai
 * @ClassName AC220V
 * @CreateTime 2021-09-07 15:11
 * @Description: 定义具体220V
 */
public class AC220V extends ACV {

    @Override
    public int output(){
        return 220;
    }
}
