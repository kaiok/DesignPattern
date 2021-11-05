package com.kais.designpattern.commond_mode;

/**
 * @Author liuxiankai
 * @ClassName VolumeCommand
 * @CreateTime 2021-09-26 15:53
 * @Description: 接口Command的（命令）实现类，开关机命令、频道转换命令、以及音量调节命令
 */
public class VolumeCommand implements Command{

    private Device device;

    public VolumeCommand(Device device) {
        this.device = device;
    }

    @Override
    public void exe() {
        device.volumeUp();
    }

    @Override
    public void unExe() {
        device.volumeDown();
    }

}
