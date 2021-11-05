package com.kais.designpattern.visistor_mode;

import java.util.List;

/**
 * @Author liuxiankai
 * @ClassName Client
 * @CreateTime 2021-09-27 14:49
 * @Description:
 */
public class Client {
    public static void main(String[] args){
        List<Element> list = ObjectStruture.getList();
        for(Element e: list){
            e.accept(new Visitor());
        }
    }
}
