package com.kais.designpattern.mediator_mode.yeah;

/**
 * @Author liuxiankai
 * @ClassName AbstractColleague
 * @CreateTime 2021-09-27 13:14
 * @Description:
 */
abstract class AbstractColleague {
    protected int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }
    /**
     * 方法描述:注意这里的参数不再是同事类，而是一个中介者
     *
 * @param number
 * @param am
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/27 13:18
    */
    public abstract void setNumber(int number, AbstractMediator am);
}