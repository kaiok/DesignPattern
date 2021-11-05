package com.kais.designpattern.Decoratorpattern.Yeah;

/**
 * @Author liuxiankai
 * @ClassName SpecificDecorator
 * @CreateTime 2021-09-13 13:13
 * @Description: 具体装饰器实现类
 * 1.加一个鸡蛋
 * 2.通过组合的方式来代替继承，为对象添加功能
 */
public class SpecificDecorator extends AbstractDecorator {
    public SpecificDecorator(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
