package com.kais.designpattern.test;

import java.util.ArrayList;

/**
 * @Author liuxiankai
 * @ClassName TestClass
 * @CreateTime 2021-09-02 13:16
 * @Description: 测试类
 */
public class TestClass {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        ParentClazz parent = new ParentClazz();
        parent.say("hello");
        ChildClazz child = new ChildClazz();
        child.say("hello");

    }

}
