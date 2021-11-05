package com.kais.designpattern.mediator_mode.nope;

/**
 * @Author liuxiankai
 * @ClassName ColleagueB
 * @CreateTime 2021-09-27 10:54
 * @Description: 同事类
 */
class ColleagueB extends AbstractColleague{

    @Override
    public void setNumber(int number, AbstractColleague coll) {
        this.number = number;
        coll.setNumber(number/100);
    }
}
