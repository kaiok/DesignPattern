package com.kais.designpattern.chain_of_responsibility_mode;

import java.util.Random;

/**
 * @Author liuxiankai
 * @ClassName Manager
 * @CreateTime 2021-09-26 9:48
 * @Description: 具体处理者：经理
 */
public class Manager extends Handler {
    Manager(String name) {
        super(name);
    }

    @Override
    public boolean process(LeaveRequest leaveRequest) {
        // 随机数大于3则为批准，否则不批准
        boolean result = (new Random().nextInt(10)) > 3;
        String log = "经理<%s> 审批 <%s> 的请假申请，请假天数： <%d> ，审批结果：<%s> ";
        System.out.println(String.format(log, this.name, leaveRequest.getName(), leaveRequest.getNumOfDays(), result ? "批准" : "不批准"));

        // 不批准
        if (!result) {
            return false;
            // 批准且天数小于7
        } else if (leaveRequest.getNumOfDays() < 7) {
            return true;
        }
        // 批准且天数大于等于7，提交给下一个处理者处理
        return nextHandler.process(leaveRequest);
    }
}
