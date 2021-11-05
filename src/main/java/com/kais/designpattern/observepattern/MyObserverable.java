package com.kais.designpattern.observepattern;

/**
 * @author Kais
 * @create 2021-07-24-20:03
 */

/*
* 定义具体被观察者角色，继承被观察者接口
* 参数为泛型，此处定义为观察者对象
* */
public class MyObserverable implements Observerable<Observer> {

    private int state;

    public MyObserverable() {
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //主题对象发生了变化，通知所有的观察者
        this.notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        /*遍历被观察者对象中的 观察者集合，并同时调用观察者的信息更新方法*/
        for(Observer obs : list){
            obs.update(this);
        }
    }
}
