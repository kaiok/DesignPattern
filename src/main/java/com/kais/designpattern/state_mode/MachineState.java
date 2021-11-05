package com.kais.designpattern.state_mode;

/**
 * @Author liuxiankai
 * @ClassName MachineState
 * @CreateTime 2021-09-27 9:35
 * @Description: 售货机状态接口
 * 状态：售罄、有硬币、无硬币、售出
 * 定义一个所有具体状态的共同接口，用来封装环境角色对象的一个特定状态的行为
 */
public interface MachineState {

    /**
     * 委托到不同具体实现类实现对应的行为
     */
    void handleRequest();

}
