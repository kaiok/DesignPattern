package com.kais.designpattern.sigletonmode;

/**
 * @author Kais
 * 饿汉单例模式
 * 特点：类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了
 * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以
 *      是线程安全的，可以直接用于多线程而不会出现问题
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }

}
