package com.kais.designpattern.chain_of_responsibility_mode;

import java.util.Random;

/**
 * @Author liuxiankai
 * @ClassName Director
 * @CreateTime 2021-09-26 9:41
 * @Description: 具体处理者：主管处理者
 */
public class Director extends Handler {
    Director(String name) {
        super(name);
    }

    @Override
    public boolean process(LeaveRequest leaveRequest) {
        // 随机数大于3则为批准，否则不批准：请假几率
        boolean result = (new Random().nextInt(10)) > 3;
        String log = "主管<%s> 审批 <%s> 的请假申请，请假天数： <%d> ，审批结果：<%s> ";
        System.out.println(String.format(log, this.name, leaveRequest.getName(), leaveRequest.getNumOfDays(), result ? "批准" : "不批准"));
        // 不批准，if（result==false）
        if (!result) {
            return false;
            // 批准且天数小于3，返回true
        } else if (leaveRequest.getNumOfDays() < 3) {
            return true;
        }
        // 批准且天数大于等于3，提交给下一个处理者处理
        return nextHandler.process(leaveRequest);
    }
}