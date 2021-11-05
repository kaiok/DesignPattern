package com.kais.designpattern.prototypemode02;

/**
 * @author Kais
 * @create 2021-07-20-10:35
 * * 深复制的实现
 * *
 * * 结论
 * * 1.p1和p2，以及他们的Address对象都具有不同的地址值
 * * 2.修改p1或者p2中对象的值，并不会影响到另一对象参数的值
 */

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype("张三");
        p1.setAddress(new Address02("江西", "赣州"));
        p1.setName("张三");
        Prototype p2 = (Prototype) p1.clone();
        p2.setName("李四");
        p2.getAddress().setProvince("北京");

        System.out.println( "p1 name:" + p1.getName() + ";p1 Province:" + p1.getAddress().getProvince());
        System.out.println("p1 hashCode:" + p1.hashCode() + ";p1.getAddress().getProvince().hashCode():" + p1.getAddress().getProvince().hashCode());
        System.out.println("==================");
        System.out.println( "P2 name:" + p2.getName() + ";p2 Province:" + p2.getAddress().getProvince());
        System.out.println("p2 hashCode:" + p2.hashCode() + ";p2.getAddress().getProvince().hashCode():" + p2.getAddress().getProvince().hashCode());

        System.out.println(p1.getAddress().getCity());

        System.out.println(p2.getAddress().getCity());
    }

}