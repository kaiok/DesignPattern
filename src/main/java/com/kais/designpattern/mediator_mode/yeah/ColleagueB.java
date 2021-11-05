package com.kais.designpattern.mediator_mode.yeah;

/**
 * @Author liuxiankai
 * @ClassName ColleagueB
 * @CreateTime 2021-09-27 13:15
 * @Description:
 */
class ColleagueB extends AbstractColleague{

    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }
}
