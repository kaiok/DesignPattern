package com.kais.designpattern.Decoratorpattern.Yeah;

/**
 * @Author liuxiankai
 * @ClassName SpecificComponent
 * @CreateTime 2021-09-13 13:06
 * @Description: 具体组件实现类
 */
public class SpecificComponent extends AbstractComponent {
    @Override
    protected String getDesc() {
        return "这是您的煎饼！";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
