package com.kais.designpattern.bridgemode;

/**
 * @Author liuxiankai
 * @ClassName Milk
 * @CreateTime 2021-09-02 14:47
 * @Description: 具体实现化部分，加奶
 */

public class Milk implements ICoffeeAdditives {
    @Override
    public void addSomething() {
        System.out.println("加奶");
    }
}