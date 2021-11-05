package com.kais.designpattern.chain_of_responsibility_mode;

import lombok.Data;

/**
 * @Author liuxiankai
 * @ClassName Handler
 * @CreateTime 2021-09-26 9:38
 * @Description: 抽象处理者类 Handler，维护一个 nextHandler 属性，该属性为当前处理者的下一个处理者的引用；声明了抽象方法 process
 * 参数：
 *  name:处理者姓名
 *  nextHandler：下一个处理者
 */
@Data
public abstract class Handler {
    protected String name;
    protected Handler nextHandler;

    Handler(String name) {
        this.name = name;
    }

    public abstract boolean process(LeaveRequest leaveRequest); // 处理请假
}
