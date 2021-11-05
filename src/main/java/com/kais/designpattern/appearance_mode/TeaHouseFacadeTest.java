package com.kais.designpattern.appearance_mode;

/**
 * @Author liuxiankai
 * @ClassName TeaHouseFacadeTest
 * @CreateTime 2021-09-26 11:41
 * @Description: 茶馆喝茶测试类
 */
public class TeaHouseFacadeTest {

    public static void main(String[] args) {
        TeaHouseFacade teaHouseFacade = new TeaHouseFacade("老舍茶馆");

        Man zhangsan = new Man("张三");
        TeaWater teawater = teaHouseFacade.makeTea(1);
        zhangsan.drink(teawater);
        System.out.println();

        Man lisi = new Man("李四");
        TeaWater teaWater1 = teaHouseFacade.makeTea(2);
        lisi.drink(teaWater1);
    }

}
