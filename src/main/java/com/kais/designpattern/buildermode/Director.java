package com.kais.designpattern.buildermode;

/**
 * @Author liuxiankai
 * @ClassName Director
 * @CreateTime 2021-08-31 11:12
 * @Description: 指挥官：调用建造者中的方法完成复杂对象的创建
 */
class Director {
    /**
     * 指挥工人按顺序造房
     * @param builder
     * @return
     */
    public Builder create(Builder builder) {

        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        builder.buildPartD();
        return builder;
    }
}