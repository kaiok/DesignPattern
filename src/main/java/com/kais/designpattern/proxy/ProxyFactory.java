package com.kais.designpattern.proxy;

/**
 * @author Kais
 * @create 2021-07-21-15:36
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建动态代理对象
 * 接口类IUserDao.java以及接口实现类,目标对象UserDao是一样的,没有做修改
 * 动态代理不需要实现接口,但是需要指定接口类型
 */
public class ProxyFactory{

    //维护一个目标对象
    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){
        /*
        * Proxy.newProxyInstance的三个参数为：
        * 类加载器
        * 增强方法所在的类，这个类实现的接口，支持多个接口
        * 实现这个接口 InvocationHandle，创建代理对象，我们自己写增强的部分
         * */
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务2");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("提交事务2");
                        return returnValue;
                    }
                }
        );
    }

}
