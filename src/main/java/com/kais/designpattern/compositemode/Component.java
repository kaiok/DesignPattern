package com.kais.designpattern.compositemode;

/**
 * @Author liuxiankai
 * @ClassName Component
 * @CreateTime 2021-09-08 9:54
 * @Description: 组合模式，简单目录树的实现，有文件夹和文件两种类型，Component类充当抽象构件角色，声明文件夹类和文件类需要的方法
 * 1.抽象构件类
 */
public abstract class Component {

    public String getName() {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public void add(Component component) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }

    public String getContent() {
        throw new UnsupportedOperationException("不支持获取内容操作");
    }

}
