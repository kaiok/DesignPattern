package com.kais.designpattern.proxy;

/**
 * @author Kais
 * @create 2021-07-21-11:59
 */

/*
* 代理对象，比如律师，房产中介等
* 代理对象帮我们的目标对象处理好事务完成之前与之后的事情，我们就只需要专注于我们自己的任务了
* */
public class UserDaoProxy implements IUserDao {

    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("代理对象帮我们做好了准备工作");

        target.save();

        System.out.println("代理对象帮我们处理好收尾工作");
    }
}
