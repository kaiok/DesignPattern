package com.kais.designpattern.adaptermode.adapterofinterface;

/**
 * @Author liuxiankai
 * @ClassName AC110V
 * @CreateTime 2021-09-07 15:13
 * @Description: 定义具体的110V，输出110伏电压
 */
public class AC110V extends ACV {

    @Override
    public int output(){
        return 110;
    }

}
