package com.kais.designpattern.mediator_mode.yeah;

/**
 * @Author liuxiankai
 * @ClassName Mediator
 * @CreateTime 2021-09-27 13:16
 * @Description:具体中介者
 */
class Mediator extends AbstractMediator {

    Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }

    /**
     * 方法描述:处理A对B的影响
     *
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/27 13:18
    */
    @Override
    public void AaffectB() {
        int number = A.getNumber();
        B.setNumber(number*100);
    }

    /**
     * 方法描述:处理B对A的影响
     *
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/27 13:18
    */
    @Override
    public void BaffectA() {
        int number = B.getNumber();
        A.setNumber(number/100);
    }
}
