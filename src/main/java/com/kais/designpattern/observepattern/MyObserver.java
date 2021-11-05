package com.kais.designpattern.observepattern;

/**
 * @author Kais
 * @create 2021-07-24-20:10
 */


/*
* 具体观察者
* */
public class MyObserver implements Observer {

    private int myState;

    @Override
    public void update(Observerable subject) {
        myState = ((MyObserverable)subject).getState();
    }

    public int getMyState(){
        return myState;
    }
    public void setMyState(int myState){
        this.myState = myState;
    }

}
