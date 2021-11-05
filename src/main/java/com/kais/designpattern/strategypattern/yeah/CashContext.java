package com.kais.designpattern.strategypattern.yeah;

import com.kais.designpattern.strategypattern.nope.CashNormal;
import com.kais.designpattern.strategypattern.nope.CashRebate;
import com.kais.designpattern.strategypattern.nope.CashReturn;
import com.kais.designpattern.strategypattern.nope.CashSuper;

/**
 * @Author liuxiankai
 * @ClassName CashContext
 * @CreateTime 2021-09-15 11:18
 * @Description: 策略与简单工厂结合，改造CashContext
 */
public class CashContext
{
    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper)
    {
        this.cashSuper = cashSuper;
    }

    public CashContext(String type)
    {
        if ("正常收费".equals(type))
        {
            cashSuper = new CashNormal();
        }
        else if ("满300返100".equals(type))
        {
            cashSuper = new CashReturn(300, 100);
        }
        else if ("打8折".equals(type))
        {
            cashSuper = new CashRebate(0.8);
        }
    }

    public double acceptCash(double money)
    {
        return cashSuper.acceptCash(money);
    }
}
