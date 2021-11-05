package com.kais.designpattern.visistor_mode;

/**
 * @Author liuxiankai
 * @ClassName ConcreteElement1
 * @CreateTime 2021-09-27 14:48
 * @Description:
 */
class ConcreteElement1 extends Element {
    @Override
    public void doSomething(){
        System.out.println("这是元素1");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
