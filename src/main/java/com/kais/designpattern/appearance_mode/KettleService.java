package com.kais.designpattern.appearance_mode;

/**
 * @Author liuxiankai
 * @ClassName KettleService
 * @CreateTime 2021-09-26 10:59
 * @Description: 烧水需要用水壶烧，将水加热
 * kettle:水壶
 */
public class KettleService {
    public void waterBurning(String who, Water water, int burnTime) {
        // 烧水，计算最终温度，返回两个int值中较小的一个
        int finalTermperature = Math.min(100, water.getTemperature() + burnTime * 20);
        water.setTemperature(finalTermperature);
        System.out.println(who + " 使用水壶烧水，最终水温为 " + finalTermperature);
    }
}