package com.kais.designpattern.buildermode;

/**
 * @Author liuxiankai
 * @ClassName ConcreteBuilder
 * @CreateTime 2021-08-31 11:09
 * @Description: 具体建造者：实现了抽象建造者接口，工人
 */
public class ConcreteBuilder extends Builder {
    private Product product;
    ConcreteBuilder() {
        product = new Product();
    }

    Product getProduct() {
        return product;
    }

    @Override
    public void buildPartA() {
        product.setBuildA("地基");
    }

    @Override
    public void buildPartB() {
        product.setBuildB("钢筋工程");
    }

    @Override
    public void buildPartC() {
        product.setBuildC("铺电线");
    }

    @Override
    public void buildPartD() {
        product.setBuildD("粉刷");
    }

    @Override
    public String toString() {
        return "ConcreteBuilder{" +
                "product=" + product +
                '}';
    }
}