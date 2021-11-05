package com.kais.designpattern.adaptermode.adapterofobject;

import com.kais.designpattern.adaptermode.adapterofclass.AC220V;
import com.kais.designpattern.adaptermode.adapterofclass.DC5V;

/**
 * @Author liuxiankai
 * @ClassName ObjectTest
 * @CreateTime 2021-09-07 14:55
 * @Description: 对象适配器测试类
 */
public class ObjectTest {

    public static void main(String[] args) {

        DC5V dc5V = new Adapter(new AC220V());

        int dc5 = dc5V.dc5v();

        System.out.println("转换后的电压为：" + dc5);

    }

}
