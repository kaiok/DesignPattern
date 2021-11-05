package com.kais.designpattern.strategypattern.nope;

/**
 * @Author liuxiankai
 * @ClassName CashNormal
 * @CreateTime 2021-09-15 10:29
 * @Description: 正常收费子类
 */
public class CashNormal implements CashSuper
{
    public double acceptCash(double money)
    {
        return money;
    }
}
