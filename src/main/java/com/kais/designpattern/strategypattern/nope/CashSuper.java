package com.kais.designpattern.strategypattern.nope;

/**
 * @Author liuxiankai
 * @ClassName CashSuper
 * @CreateTime 2021-09-15 9:59
 * @Description: 现金收费抽象类
 * 1.使用简单工厂模式实现根据商品单价和数量计算费用
 * 2.收费模式
 *      1）：正常收费
 *      2）：打折销售
 *      3）：返利收费子类
 */
public interface CashSuper {

    public double acceptCash(double money);

}
