package com.kais.designpattern.commond_mode;

/**
 * @Author liuxiankai
 * @ClassName Controller
 * @CreateTime 2021-09-26 15:53
 * @Description:
 * 1.遥控器类，也就是命令发送方了。遥控器集成了OK按键以及上下左右方向键
 * 2.控制器对设备一无所知，也就是它上面不再绑定有任何设备了，而是只绑定命令
 */
public class Controller {
    private Command okCommand;
    private Command verticalCommand;
    private Command horizontalCommand;

    /**
     * 方法描述:绑定OK键命令
     *
 * @param okCommand
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/26 16:41
    */
    public void bindOKCommand(Command okCommand) {
        this.okCommand = okCommand;
    }

    /**
     * 方法描述:绑定上下方向键命令
     *
 * @param verticalCommand
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/26 16:41
    */
    public void bindVerticalCommand(Command verticalCommand) {
        this.verticalCommand = verticalCommand;
    }

    /**
     * 方法描述:绑定左右方向键命令
     *
 * @param horizontalCommand
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/26 16:42
    */
    public void bindHorizontalCommand(Command horizontalCommand) {
        this.horizontalCommand = horizontalCommand;
    }

    // 开始按键映射命令
    public void buttonOKHold() {
        System.out.print("长按OK按键……");
        okCommand.exe();
    }

    public void buttonOKClick() {
        System.out.print("单击OK按键……");
        okCommand.unExe();
    }

    public void buttonUpClick() {
        System.out.print("单击↑按键……");
        verticalCommand.exe();
    }

    public void buttonDownClick() {
        System.out.print("单击↓按键……");
        verticalCommand.unExe();
    }

    public void buttonLeftClick() {
        System.out.print("单击←按键……");
        horizontalCommand.unExe();
    }

    public void buttonRightClick() {
        System.out.print("单击→按键……");
        horizontalCommand.exe();
    }
}
