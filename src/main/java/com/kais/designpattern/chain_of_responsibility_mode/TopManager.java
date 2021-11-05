package com.kais.designpattern.chain_of_responsibility_mode;

import java.util.Random;

/**
 * @Author liuxiankai
 * @ClassName TopManager
 * @CreateTime 2021-09-26 9:51
 * @Description: 具体处理者：总经理
 */
public class TopManager extends Handler {
    TopManager(String name) {
        super(name);
    }

    @Override
    public boolean process(LeaveRequest leaveRequest) {
        // 随机数大于3则为批准，否则不批准
        boolean result = (new Random().nextInt(10)) > 3;
        String log = "总经理<%s> 审批 <%s> 的请假申请，请假天数： <%d> ，审批结果：<%s> ";
        System.out.println(String.format(log, this.name, leaveRequest.getName(), leaveRequest.getNumOfDays(), result ? "批准" : "不批准"));
        // 返回总经理的决定
        return result;
    }
}
