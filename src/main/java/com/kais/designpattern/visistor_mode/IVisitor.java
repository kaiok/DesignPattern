package com.kais.designpattern.visistor_mode;

/**
 * @Author liuxiankai
 * @ClassName IVisitor
 * @CreateTime 2021-09-27 14:48
 * @Description:抽象访问者，声明访问者可以访问哪些元素
 */
interface IVisitor {
    /**
     * 方法描述:方法的重载，将可以访问的元素放在重载的visit方法中
     *
 * @param el1
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/27 15:07
    */
    public void visit(ConcreteElement1 el1);
    public void visit(ConcreteElement2 el2);
}
