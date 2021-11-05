package com.kais.designpattern.Decoratorpattern.Yeah;

/**
 * @Author liuxiankai
 * @ClassName AbstractDecorator
 * @CreateTime 2021-09-13 13:08
 * @Description: 抽象装饰者角色
 */
public class AbstractDecorator extends AbstractComponent {

    private AbstractComponent abstractComponent;

    public AbstractDecorator(AbstractComponent abstractComponent){
        this.abstractComponent = abstractComponent;
    }


    @Override
    protected String getDesc() {
        return this.abstractComponent.getDesc();
    }

    @Override
    protected int cost() {
        return this.abstractComponent.cost();
    }
}
