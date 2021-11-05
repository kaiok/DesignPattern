package com.kais.designpattern.sigletonmode;

/**
 * 多线程程序，则不要删除上例代码中的关键字 volatile 和 synchronized，
 *      否则将存在线程非安全的问题
 * 每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点
 * 特点：类加载时没有生成单例，只有当第一次调用 getInstance 方法时才去创建这个单例
 */
class LazySingleton {

    /**
     * 保证instance在所有线程中同步
     */
    private static volatile LazySingleton instance = null;

    /**
     * private避免类在外部被实例化
     */
    private LazySingleton(){

    }

    public static synchronized LazySingleton getInstance(){
        //getInstance 方法前加同步
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
