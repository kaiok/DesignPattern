package com.kais.designpattern.strategypattern.yeahexample;

/**
 * @Author liuxiankai
 * @ClassName Client
 * @CreateTime 2021-09-15 10:47
 * @Description: 客户端代码
 */
public class Client {
    public static void main(String[] args)
    {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}