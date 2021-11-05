package com.kais.designpattern.commond_mode;

/**
 * @Author liuxiankai
 * @ClassName Command
 * @CreateTime 2021-09-26 15:48
 * @Description: 命令接口
 * 解耦的重点了，我们在策略模式的基础上又增加一层中间模块
 */
public interface Command {

    /**
     * 方法描述:执行命令操作
     *
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/26 16:38
    */
    public void exe();

    /**
     * 方法描述:反执行命令操作
     *
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/26 16:39
    */
    public void unExe();

}
