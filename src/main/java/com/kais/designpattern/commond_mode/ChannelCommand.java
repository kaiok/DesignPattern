package com.kais.designpattern.commond_mode;

/**
 * @Author liuxiankai
 * @ClassName ChannelCommand
 * @CreateTime 2021-09-26 15:52
 * @Description: 接口Command的（命令）实现类，开关机命令、频道转换命令、以及音量调节命令
 */
public class ChannelCommand implements Command{

    private Device device;

    public ChannelCommand(Device device) {
        this.device = device;
    }

    @Override
    public void exe() {
        device.channelUp();
    }

    @Override
    public void unExe() {
        device.channelDown();
    }

}
