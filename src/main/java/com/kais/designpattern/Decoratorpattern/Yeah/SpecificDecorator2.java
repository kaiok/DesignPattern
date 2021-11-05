package com.kais.designpattern.Decoratorpattern.Yeah;

/**
 * @Author liuxiankai
 * @ClassName SpecificDecorator2
 * @CreateTime 2021-09-13 13:15
 * @Description: 具体装饰器实现类
 * 1.加一根火腿
 */
public class SpecificDecorator2 extends AbstractDecorator {
    public SpecificDecorator2(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根火腿";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
