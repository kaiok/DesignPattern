package com.kais.designpattern.state_mode;

/**
 * @Author liuxiankai
 * @ClassName NoCoinState
 * @CreateTime 2021-09-27 9:35
 * @Description: 没有硬币状态
 */
public class NoCoinState implements MachineState {

    private MachineContext machineContext;

    public NoCoinState(MachineContext machineContext) {
        this.machineContext = machineContext;
    }

    @Override
    public void handleRequest() {
        System.out.println("你没有投币，请先投币。");
    }

}
