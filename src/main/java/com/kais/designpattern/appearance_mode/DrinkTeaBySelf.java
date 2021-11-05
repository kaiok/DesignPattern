package com.kais.designpattern.appearance_mode;

/**
 * @Author liuxiankai
 * @ClassName DrinkTeaBySelf
 * @CreateTime 2021-09-26 11:33
 * @Description: 自己泡茶喝
 */
public class DrinkTeaBySelf {

    public static void main(String[] args) {
        Man zhangsan = new Man("张三");
        KettleService kettleService1 = new KettleService();
        TeasetService teaseService1 = new TeasetService();
        Water water1 = new Water();
        TeaLeaf teaLeaf1 = new TeaLeaf("西湖龙井");
        kettleService1.waterBurning(zhangsan.getName(), water1, 4);
        TeaWater teaWater1 = teaseService1.makeTeaWater(zhangsan.getName(), water1, teaLeaf1);
        zhangsan.drink(teaWater1);
        System.out.println();

        Man lisi = new Man("李四");
        KettleService kettleService2 = new KettleService();
        TeasetService teaseService2 = new TeasetService();
        Water water2 = new Water(10, 15);
        TeaLeaf teaLeaf2 = new TeaLeaf("碧螺春");
        kettleService2.waterBurning(lisi.getName(), water2, 4);
        TeaWater teaWater2 = teaseService2.makeTeaWater(lisi.getName(), water2, teaLeaf2);
        lisi.drink(teaWater2);
    }

}
