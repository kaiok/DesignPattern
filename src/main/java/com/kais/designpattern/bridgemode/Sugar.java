package com.kais.designpattern.bridgemode;

/**
 * @Author liuxiankai
 * @ClassName Sugar
 * @CreateTime 2021-09-02 14:47
 * @Description: 具体实现化部分，加糖
 */
public class Sugar implements ICoffeeAdditives {
    @Override
    public void addSomething() {
        System.out.println("加糖");
    }
}