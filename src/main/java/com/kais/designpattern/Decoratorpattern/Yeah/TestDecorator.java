package com.kais.designpattern.Decoratorpattern.Yeah;

/**
 * @Author liuxiankai
 * @ClassName TestDecorator
 * @CreateTime 2021-09-13 13:16
 * @Description: 装饰器模式的实现，测试：加两个鸡蛋一根香肠的杂粮煎饼
 */
public class TestDecorator {

    public static void main(String[] args) {

        AbstractComponent abstractComponent = new SpecificComponent();

        //加两鸡蛋和一根火腿
        abstractComponent = new SpecificDecorator(abstractComponent);
        abstractComponent = new SpecificDecorator(abstractComponent);
        abstractComponent = new SpecificDecorator2(abstractComponent);

        System.out.println(abstractComponent.getDesc() + "价格为：" + abstractComponent.cost());


    }

}
