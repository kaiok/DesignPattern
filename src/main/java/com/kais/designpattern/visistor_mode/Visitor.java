package com.kais.designpattern.visistor_mode;

/**
 * @Author liuxiankai
 * @ClassName Visitor
 * @CreateTime 2021-09-27 14:49
 * @Description:具体访问者
 */
class Visitor implements IVisitor {
    @Override
    public void visit(ConcreteElement1 el1) {
        el1.doSomething();
    }
    @Override
    public void visit(ConcreteElement2 el2) {
        el2.doSomething();
    }
}
