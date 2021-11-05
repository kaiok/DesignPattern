package com.kais.designpattern.Decoratorpattern.Yeah;

/**
 * @Author liuxiankai
 * @ClassName AbstractComponent
 * @CreateTime 2021-09-13 11:17
 * @Description: 抽象组件类
 * 1.使用装饰者模式，实现卖煎饼小程序
 */
public abstract class AbstractComponent {

    /**
     * 方法描述:抽象组件类，煎饼类
     *
    */
    protected abstract String getDesc();

    /**
     * 方法描述:煎饼的价格
     *
    */
    protected abstract int cost();

}
