package com.kais.designpattern.commond_mode;

/**
 * @Author liuxiankai
 * @ClassName ClientCommand
 * @CreateTime 2021-09-26 16:14
 * @Description: 命令模式客户类
 * 1.客户端可以肆意妄为地组装各个模块了，也就是说可以遥控电视，也可以遥控收音机，或许绑定上下键调音量，或许是换成左右键调音量，
 *      甚至可以定义一个宏命令去控制灯泡的切换开关实现一种霓虹灯闪烁的效果
 * 2.发令控制方与接受执行方完全被拆解开，这让我们实现了对各模块的自由扩展，对指令映射、设备绑定的灵活操控，
 *      松散的系统得以成就繁多模块解耦的最终目的
 */
public class ClientCommand {

    public static void main(String[] args) {
        System.out.println("===客户端用【可编程式遥控器】操作电器===");
        Device tv = new TV();
        Device radio = new Radio();
        Controller controller = new Controller();

        //绑定【电视机】的【命令】到【控制器按键】
        controller.bindOKCommand(new SwitchCommand(tv));
        //上下调台
        controller.bindVerticalCommand(new ChannelCommand(tv));
        //左右调音
        controller.bindHorizontalCommand(new VolumeCommand(tv));

        controller.buttonOKHold();
        controller.buttonUpClick();
        controller.buttonUpClick();
        controller.buttonDownClick();
        controller.buttonRightClick();


        //绑定【收音机】的【命令】到【控制器按键】
        controller.bindOKCommand(new SwitchCommand(radio));
        //上下调音
        controller.bindVerticalCommand(new VolumeCommand(radio));
        //左右调台
        controller.bindHorizontalCommand(new ChannelCommand(radio));

        controller.buttonOKHold();
        controller.buttonUpClick();
        controller.buttonUpClick();
        controller.buttonRightClick();
        controller.buttonDownClick();

    }

}
