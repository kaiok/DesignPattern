package com.kais.designpattern.proxy;

/**
 * @author Kais
 * @create 2021-07-21-11:58
 */

/*
* 目标对象，主体，我们
* */
public class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("我已经处理好数据并保存成功了");
    }
}
