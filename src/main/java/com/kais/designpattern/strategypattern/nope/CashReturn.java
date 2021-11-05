package com.kais.designpattern.strategypattern.nope;

/**
 * @Author liuxiankai
 * @ClassName CashReturn
 * @CreateTime 2021-09-15 10:33
 * @Description: 返利收费子类
 */
public class CashReturn implements CashSuper
{
    private double  moneyCondition  = 0;
    private double  moneyReturn     = 0;

    public CashReturn(double moneyCondition, double moneyReturn)
    {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money)
    {
        double result = money;
        if (money >= moneyCondition)
        {
            result = money - money / moneyCondition * moneyReturn;
        }
        return result;
    }
}