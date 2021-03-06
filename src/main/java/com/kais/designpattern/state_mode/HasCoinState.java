package com.kais.designpattern.state_mode;

/**
 * @Author liuxiankai
 * @ClassName HasCoinState
 * @CreateTime 2021-09-27 9:36
 * @Description: 投入硬币后的状态
 */
public class HasCoinState implements MachineState {

    private MachineContext machineContext;

    public HasCoinState(MachineContext machineContext) {
        this.machineContext = machineContext;
        }

    @Override
    public void handleRequest() {
        System.out.println("收到硬币，即将为你准备汽水，请稍等...");
        //进入销售状态
        machineContext.setCurrentState(machineContext.getSellingState());
        //委托到销售中状态行为
        machineContext.getCurrentState().handleRequest();
        }
}