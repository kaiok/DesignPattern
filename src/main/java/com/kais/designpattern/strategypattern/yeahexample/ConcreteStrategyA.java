package com.kais.designpattern.strategypattern.yeahexample;

/**
 * @Author liuxiankai
 * @ClassName ConcreteStrategyA
 * @CreateTime 2021-09-15 10:45
 * @Description: ConcreteStrategy封装了具体的算法或行为，继承于Strategy
 */
public class ConcreteStrategyA implements Strategy
{
    @Override
    public void algorithmInterface()
    {
        System.out.println("算法A实现");
    }
}


