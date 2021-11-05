package com.kais.designpattern.strategypattern.yeahexample;

/**
 * @Author liuxiankai
 * @ClassName Context
 * @CreateTime 2021-09-15 10:47
 * @Description: Context用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
 */
class Context
{
    private Strategy strategy;

    Context(Strategy strategy) //初始化时，传入具体的策略对象
    {
        this.strategy = strategy;
    }

    void contextInterface() //根据具体的策略对象，调用其算法的方法
    {
        strategy.algorithmInterface();
    }
}