package com.kais.designpattern.strategypattern.nope;

/**
 * @Author liuxiankai
 * @ClassName CashRebate
 * @CreateTime 2021-09-15 10:29
 * @Description: 打折收费子类
 */
public class CashRebate implements CashSuper
{
    private double  moneyRebate = 1;

    public CashRebate(double moneyRebate)
    {
        this.moneyRebate = moneyRebate;
    }

    public double acceptCash(double money)
    {
        return money * moneyRebate;
    }
}
