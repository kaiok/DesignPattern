package com.kais.designpattern.sigletonmode;

/**
 * @Author liuxiankai
 * @ClassName President
 * @CreateTime 2021-08-30 15:35
 * @Description: 懒汉式单例模式示例——总统
 */
class President {

    /**
     * 保证instance在所有线程中同步
     */
    private static volatile President instance = null;

    /**
     * private避免类在外部被实例化
     */
    private President() {
        System.out.println("产生一个总统！");
    }
    static synchronized President getInstance() {
        //在getInstance方法上加同步
        if (instance == null) {
            instance = new President();
        } else {
            System.out.println("已经有一个总统，不能产生新总统！");
        }
        return instance;
    }
    void getName() {
        System.out.println("我是美国总统：特朗普。");
    }

}
