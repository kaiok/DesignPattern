package com.kais.designpattern.observepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kais
 * @create 2021-07-24-20:01
 */

/*
* 定义抽象被观察角色
* */
public interface Observerable<T> {

    /*被观察者中需要定义 用于存储观察者的集合*/
    List<Observer> list = new ArrayList<>();

    /*注册观察者*/
    public void registerObserver(T observer);

    /*删除观察者*/
    public void removeObserver(T observer);

    /*将信息通知所有的观察者*/
    public void notifyAllObservers();

}
