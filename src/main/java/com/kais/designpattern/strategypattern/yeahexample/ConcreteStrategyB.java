package com.kais.designpattern.strategypattern.yeahexample;

/**
 * @Author liuxiankai
 * @ClassName ConcreteStrategyB
 * @CreateTime 2021-09-15 10:46
 * @Description: ConcreteStrategy封装了具体的算法或行为，继承于Strategy
 */
public class ConcreteStrategyB implements Strategy
{
    @Override
    public void algorithmInterface()
    {
        System.out.println("算法B实现");
    }
}