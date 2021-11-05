package com.kais.designpattern.strategypattern.yeah;

/**
 * @Author liuxiankai
 * @ClassName ClientTest
 * @CreateTime 2021-09-15 11:19
 * @Description: 客户端
 * 1，简单工厂模式需要让客户端认识两个类，CashSuper和CashFactory，而策略模式与简单工厂模式结合的用法，
 * 客户端就只需要认识一个类CashContext，耦合度更加降低
 */
public class ClientTest {
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
        CashContext cashContext = new CashContext(type);

        double totalPrices = cashContext.acceptCash(num * price);
        total += totalPrices;

        System.out.println("单价:" + price + " 数量:" + num + "合计:" + totalPrices);
    }
}
