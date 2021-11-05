package com.kais.designpattern.buildermode;

/**
 * @Author liuxiankai
 * @ClassName Builder
 * @CreateTime 2021-08-31 11:07
 * @Description: 抽象建造者：包含创建产品各个子部件的抽象方法
 */
abstract class Builder {
    /**
     * 创建产品对象
     */
    private Product product = new Product();

    /**
     * 方法描述:创建产品各个子部件的抽象方法的接口
     *
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/2 10:27
    */
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public abstract void buildPartD();

    /**
     * 方法描述:返回复杂产品的方法
     *
     * @返回值 : com.kais.designpattern.buildermode.Product
     * @作者 : lxk
     * 时间:2021/9/2 10:28
    */
    Product getResult() {
        return product;
    }
}