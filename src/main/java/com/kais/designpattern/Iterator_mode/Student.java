package com.kais.designpattern.Iterator_mode;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author liuxiankai
 * @ClassName Student
 * @CreateTime 2021-09-27 13:49
 * @Description: 定义一个学生类，有一个报数方法 count()
 */
@Getter
@Setter
@ToString
class Student {
    private String name;
    private Integer number;

    Student(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    void count() {
        System.out.println(String.format("我是 %d 号 %s", this.number, this.name));
    }
}