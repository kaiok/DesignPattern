package com.kais.designpattern.mediator_mode.yeah;

/**
 * @Author liuxiankai
 * @ClassName AbstractMediator
 * @CreateTime 2021-09-27 13:16
 * @Description:抽象中介者
 */
abstract class AbstractMediator {
    protected AbstractColleague A;
    protected AbstractColleague B;

    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        A = a;
        B = b;
    }

    public abstract void AaffectB();

    public abstract void BaffectA();

}
