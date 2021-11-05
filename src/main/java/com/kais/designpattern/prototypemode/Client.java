package com.kais.designpattern.prototypemode;

/**
 * @author Kais
 * @create 2021-07-20-0:29
 * 原型模式的设计
 * 浅复制的实现
 * 结论：
 * 1.p1与p2为不同的两个对象（hashCode不同）
 * 2.p1.clone赋值给p2后
 * 3.p1和p2都指向了同一个Address对象
 * 4.也就是说，修改p1或者p2中的Address对象中的参数，p1和p2会同时改变值
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype("原型1");
        p1.setAddress(new Address("江西", "赣州"));
        p1.setName("张三");

        //浅复制的实现：clone出来的对象与具体原型对象具有相同的hashcode
        Prototype p2 = (Prototype) p1.clone();
        p2.setName("李四");
        p2.getAddress().setProvince("深圳");


        System.out.println( "p1 name:" + p1.getName() + ";p1 Province:" + p1.getAddress().getProvince());
        System.out.println("p1 hashCode:" + p1.hashCode() + ";p1.getAddress().getProvince().hashCode():" + p1.getAddress().getProvince().hashCode());
        System.out.println("==================");
        System.out.println( "P2 name:" + p2.getName() + ";p2 Province:" + p2.getAddress().getProvince());
        System.out.println("p2 hashCode:" + p2.hashCode() + ";p2.getAddress().getProvince().hashCode():" + p2.getAddress().getProvince().hashCode());

        System.out.println(p1.getAddress().getCity());
        System.out.println(p2.getAddress().getCity());
    }
}
