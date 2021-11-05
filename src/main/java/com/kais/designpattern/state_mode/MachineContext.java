package com.kais.designpattern.state_mode;

/**
 * @Author liuxiankai
 * @ClassName MachineContext
 * @CreateTime 2021-09-27 9:34
 * @Description: 机器上下文-持有所有状态，以及当前状态的引用
 * 定义售货机类
 * 拥有的装填：售罄、有硬币、无硬币、售出
 * 包含客户端所有感兴趣的功能状态，并且持有一个具体状态的实例，这个具体状态的实例就是当前环境对象的现有状态
 */
class MachineContext {

    //持有的状态
    private MachineState noCoinState;
    private MachineState hasCoinState;
    private MachineState sellingState;
    private MachineState sellOutState;
    MachineContext(int count) {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        sellingState = new SellingState(this);
        sellOutState = new SellOutState(this);

        this.count = count;
        if (count > 0) {
            currentState = noCoinState;
        } else {
            currentState = sellOutState;
        }
    }

    /**
     * 默认售罄状态
     */
    private MachineState currentState = sellOutState;
    /**
     * 记录肥宅水数量
     */
    private int count;


    //所有的行为都委托到当前状态类

    /**
     * 投入硬币
     */
    public void putCoin() {
        if (count > 0) {
            this.setCurrentState(getHasCoinState());
        }
        currentState.handleRequest();
    }


    public MachineState getNoCoinState() {
        return noCoinState;
    }

    public MachineState getHasCoinState() {
        return hasCoinState;
    }

    public MachineState getSellingState() {
        return sellingState;
    }

    public MachineState getSellOutState() {
        return sellOutState;
    }

    public MachineState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(MachineState currentState) {
        this.currentState = currentState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
