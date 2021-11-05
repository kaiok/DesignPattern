package com.kais.designpattern.observepattern;

/**
 * @author Kais
 * @create 2021-07-24-20:02
 */


/*
* 抽象观察者角色
* */
public interface Observer {

    /*更新被观察者传来的信息*/
    void update(Observerable observerable);

}
