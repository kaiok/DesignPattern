package com.kais.designpattern.state_mode;

/**
 * @Author liuxiankai
 * @ClassName SellOutState
 * @CreateTime 2021-09-27 9:38
 * @Description: 售罄状态
 * 处理来自 Context 的请求，每个具体状态类都实现了环境的一个状态对应的行为特性
 */
public class SellOutState implements MachineState {
    private MachineContext machineContext;

    public SellOutState(MachineContext machineContext) {
        this.machineContext = machineContext;
    }

    @Override
    public void handleRequest() {
        System.out.println("汽水售罄,退回你的硬币");
    }
}