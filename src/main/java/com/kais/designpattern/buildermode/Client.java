package com.kais.designpattern.buildermode;

/**
 * @Author liuxiankai
 * @ClassName Client
 * @CreateTime 2021-08-31 11:14
 * @Description: 客户类
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        builder = director.create(builder);
        System.out.println(builder);
    }
}