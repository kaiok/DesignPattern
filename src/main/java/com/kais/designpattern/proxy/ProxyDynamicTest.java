package com.kais.designpattern.proxy;

/**
 * @author Kais
 * @create 2021-07-21-15:37
 */

/*
* 动态代理
* 特点：
* 1、代理对象，不需要实现接口
* 2、代理对象的生成，是利用JDK的API，动态的在内存中构建代理对象（需要我们指定创建代理对象、目标对象实现的接口类型）
* 3、动态代理也叫做：JDK代理，接口代理
* */
public class ProxyDynamicTest {

    public static void main(String[] args) {
        // 目标对象
        IUserDao target = new UserDao();
        // 【原始的类型 class com.kais.designpattern.proxy.UserDao】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        //IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        IUserDao proxy = (IUserDao) proxyFactory.getProxyInstance();

        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();
    }

}
