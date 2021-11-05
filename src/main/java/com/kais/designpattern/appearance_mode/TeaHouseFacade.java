package com.kais.designpattern.appearance_mode;

/**
 * @Author liuxiankai
 * @ClassName TeaHouseFacade
 * @CreateTime 2021-09-26 11:39
 * @Description: 到茶馆喝茶
 * 张三和李四点茶，只需要告诉茶馆套餐编号即可，水、茶叶由茶馆准备，烧水泡茶的操作由茶馆统一完成
 */
class TeaHouseFacade {
    private String name;
    private TeasetService teasetService;
    private KettleService kettleService;

    TeaHouseFacade(String name) {
        this.name = name;
        this.teasetService = new TeasetService();
        this.kettleService = new KettleService();
    }

    TeaWater makeTea(int teaNumber) {
        switch (teaNumber) {
            case 1:
                Water water1 = new Water();
                TeaLeaf teaLeaf1 = new TeaLeaf("西湖龙井");
                kettleService.waterBurning(this.name, water1, 4);
                return teasetService.makeTeaWater(this.name, water1, teaLeaf1);
            case 2:
                Water water2 = new Water(10, 15);
                TeaLeaf teaLeaf2 = new TeaLeaf("碧螺春");
                kettleService.waterBurning(this.name, water2, 4);
                return teasetService.makeTeaWater(this.name, water2, teaLeaf2);
            default:
                Water water3 = new Water();
                TeaLeaf teaLeaf3 = new TeaLeaf("招牌乌龙");
                kettleService.waterBurning(this.name, water3, 5);
                return teasetService.makeTeaWater(this.name, water3, teaLeaf3);
        }
    }
}
