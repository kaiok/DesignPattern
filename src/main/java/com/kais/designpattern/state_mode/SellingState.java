package com.kais.designpattern.state_mode;

/**
 * @Author liuxiankai
 * @ClassName SellingState
 * @CreateTime 2021-09-27 9:37
 * @Description: 售出货物状态
 * 处理来自 Context 的请求，每个具体状态类都实现了环境的一个状态对应的行为特性
 *
 */
public class SellingState implements MachineState {

    private MachineContext machineContext;

    public SellingState(MachineContext machineContext) {
            this.machineContext = machineContext;
        }

    @Override
    public void handleRequest() {
        int count = machineContext.getCount();

        --count;
        machineContext.setCount(count);
        System.out.println("正在售出汽水，请取走。");
        if (count > 0) {
            //恢复到没有硬币状态
            machineContext.setCurrentState(machineContext.getNoCoinState());
        } else {
            //进入售罄状态
            machineContext.setCurrentState(machineContext.getSellOutState());
        }
    }
}

