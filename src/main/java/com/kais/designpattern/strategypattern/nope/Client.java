package com.kais.designpattern.strategypattern.nope;

/**
 * @Author liuxiankai
 * @ClassName Client
 * @CreateTime 2021-09-15 10:32
 * @Description: 客户端程序
 */
public class Client {
    private static double   total   = 0;

    public static void main(String[] args)
    {
        consume("正常收费", 1, 1000);
        consume("满300返100", 1, 1000);
        consume("打8折", 1, 1000);

        System.out.println("总计:" + total);
    }

    private static void consume(String type, int num, double price)
    {
        CashSuper csuper = CashFactory.createCash(type);
        double totalPrices = 0;
        totalPrices = csuper.acceptCash(num * price);
        total += totalPrices;
        System.out.println("单价:" + price + " 数量:" + num + "合计:" + totalPrices);
    }
}