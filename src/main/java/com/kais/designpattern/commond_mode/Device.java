package com.kais.designpattern.commond_mode;

/**
 * @Author liuxiankai
 * @ClassName Device
 * @CreateTime 2021-09-26 15:44
 * @Description:
 * 1.新定义出一组”命令“模块把控制器（发令者）与设备（执行者）彻底解耦，
 * 就以电视机和遥控器举例说明
 * 2.第1行的接口继承，我们的高级设备接口则遗传了之前的简单通断电接口，
 * 并新增了调节频道和音量4个功能
 *
 */
public interface Device extends Switchable{

    /**
     * 方法描述:频道+
     *
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/26 16:33
    */
    public void channelUp();
    /**
     * 方法描述:频道-
     *
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/26 16:34
    */
    public void channelDown();
    /**
     * 方法描述:音量+
     *
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/26 16:34
    */
    public void volumeUp();
    /**
     * 方法描述:音量-
     *
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/26 16:34
    */
    public void volumeDown();

}
