package com.kais.designpattern.appearance_mode;

/**
 * @Author liuxiankai
 * @ClassName Water
 * @CreateTime 2021-09-26 10:58
 * @Description: 泡茶需要水 Water
 * 参数：
 *  temperature:温度
 *  capacity:容量
 */
public class Water {

    private int temperature;
    private int capacity;
    Water() {
        this.temperature = 0;
        this.capacity = 10;
    }


    Water(int temperature, int capacity) {
        this.temperature = temperature;
        this.capacity = capacity;
    }

    int getTemperature() {
        return temperature;
    }

    void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}