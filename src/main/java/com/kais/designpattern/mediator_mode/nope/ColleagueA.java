package com.kais.designpattern.mediator_mode.nope;

/**
 * @Author liuxiankai
 * @ClassName ColleagueA
 * @CreateTime 2021-09-27 10:53
 * @Description: 同事类
 */
class ColleagueA extends AbstractColleague{
    @Override
    public void setNumber(int number, AbstractColleague coll) {
        this.number = number;
        coll.setNumber(number*100);
    }
}
