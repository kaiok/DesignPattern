package com.kais.designpattern.commond_mode;

/**
 * @Author liuxiankai
 * @ClassName SwitchCommand
 * @CreateTime 2021-09-26 15:50
 * @Description: 接口Command的（命令）实现类，开关机命令、频道转换命令、以及音量调节命令
 */
public class SwitchCommand implements Command {

    // 此处持有高级设备接口。
    private Device device;

    public SwitchCommand(Device device) {
        this.device = device;
    }

    @Override
    public void exe() {
        device.on();// 执行命令调用开机操作
    }

    @Override
    public void unExe() {
        device.off();// 反执行命令调用关机操作
    }

}
