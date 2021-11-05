package com.kais.designpattern.appearance_mode;

/**
 * @Author liuxiankai
 * @ClassName TeaLeaf
 * @CreateTime 2021-09-26 10:59
 * @Description: 泡茶需要茶叶 TeaLeaf
 */
public class TeaLeaf {

    private String teaName;

    TeaLeaf(String teaName) {
        this.teaName = teaName;
    }

    String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }
}
