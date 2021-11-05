package com.kais.designpattern.visistor_mode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author liuxiankai
 * @ClassName ObjectStruture
 * @CreateTime 2021-09-27 14:49
 * @Description:一个元素的容器，一般包含一个容纳多个不同类、不同接口的容器，
 * 如List、Set、Map等，在项目中一般很少抽象出这个角色
 */
class ObjectStruture {
    static List<Element> getList(){
        List<Element> list = new ArrayList<>();
        Random ran = new Random();
        for(int i=0; i<10; i++){
            int a = ran.nextInt(100);
            if(a>50){
                list.add(new ConcreteElement1());
            }else{
                list.add(new ConcreteElement2());
            }
        }
        return list;
    }
}