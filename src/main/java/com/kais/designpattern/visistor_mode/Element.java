package com.kais.designpattern.visistor_mode;

/**
 * @Author liuxiankai
 * @ClassName Element
 * @CreateTime 2021-09-27 14:47
 * @Description:抽象元素类,声明接受哪一类访问者访问，程序上是通过accept方法中的参数来定义的
 */
abstract class Element {
    /**
     * 方法描述:声明元素可以接受的访问者
     *
 * @param visitor
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/27 15:08
    */
    public abstract void accept(IVisitor visitor);
    public abstract void doSomething();
}
