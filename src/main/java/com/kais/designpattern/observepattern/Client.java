package com.kais.designpattern.observepattern;

/**
 * @author Kais
 * @create 2021-07-24-20:13
 */
public class Client {
    public static void main(String[] args) {
        //被观察者对象，就相当于报社
        MyObserverable myObserverable = new MyObserverable();

        //创建多个观察者，相当于订阅报社报纸的用户
        MyObserver obs1 = new MyObserver();
        MyObserver obs2 = new MyObserver();
        MyObserver obs3 = new MyObserver();

        //将这三个观察者添加到被观察者对象的观察者队伍中
        myObserverable.registerObserver(obs1);
        myObserverable.registerObserver(obs2);
        myObserverable.registerObserver(obs3);

        /*观察者们的原数据为*/
        System.out.println("观察者们的原数据为:");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

        myObserverable.setState(55);
        System.out.println("被观察者将数据更新为55");
        /*
        * 1.将需要更新的数据存储起来
        * 2.调用信息通知方法（进入信息通知环节）
        * 3.在方法中遍历每一个观察者对象的同时，调用观察者中的信息更新方法
        * 4.观察者对象在信息更新方法中获取  被观察者需要更新的数据
        * 5.遍历完所有观察者对象，信息通知环节结束
        * */
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

    }
}

