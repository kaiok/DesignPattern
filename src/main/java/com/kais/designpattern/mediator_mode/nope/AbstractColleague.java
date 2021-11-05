package com.kais.designpattern.mediator_mode.nope;

/**
 * @Author liuxiankai
 * @ClassName AbstractColleague
 * @CreateTime 2021-09-27 10:52
 * @Description: 抽象同事类
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
     * 方法描述:抽象方法，修改数字时同时修改关联对象
     *
 * @param number
 * @param coll
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/27 10:53
    */
    public abstract void setNumber(int number, AbstractColleague coll);
}
