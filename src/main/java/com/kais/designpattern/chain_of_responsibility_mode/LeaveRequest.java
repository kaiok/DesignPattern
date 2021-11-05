package com.kais.designpattern.chain_of_responsibility_mode;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author liuxiankai
 * @ClassName LeaveRequest
 * @CreateTime 2021-09-26 9:37
 * @Description: 请假信息类，包含请假人姓名和请假天数
 */
@Data
@AllArgsConstructor
class LeaveRequest {
    private String name;
    private int numOfDays;
}


