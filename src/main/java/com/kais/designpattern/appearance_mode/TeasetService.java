package com.kais.designpattern.appearance_mode;

/**
 * @Author liuxiankai
 * @ClassName TeasetService
 * @CreateTime 2021-09-26 11:03
 * @Description: 泡茶，将烧好的水与茶叶进行冲泡，最终得到一杯茶水
 */
class TeasetService {
    TeaWater makeTeaWater(String who, Water water, TeaLeaf teaLeaf) {
        String teaWater = "一杯容量为 " + water.getCapacity() + ", 温度为 " + water.getTemperature() + " 的" + teaLeaf.getTeaName() + "茶水";
        System.out.println(who + " 泡了" + teaWater);
        return new TeaWater(teaWater);
    }
}