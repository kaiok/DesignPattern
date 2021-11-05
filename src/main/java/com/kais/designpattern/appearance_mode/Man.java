package com.kais.designpattern.appearance_mode;

/**
 * @Author liuxiankai
 * @ClassName Man
 * @CreateTime 2021-09-26 11:29
 * @Description: 人喝茶
 */
public class Man {
    private String name;
    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drink(TeaWater teawater) {
        System.out.println(name + " 喝了" + teawater.getTeaWater());
    }
}
