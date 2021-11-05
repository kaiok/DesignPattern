package com.kais.designpattern.memopattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author liuxiankai
 * @ClassName ChessmanMemento
 * @CreateTime 2021-09-14 9:29
 * @Description: 备忘录角色
 * 1.该类用于存储原发器的内部状态
 */
@Data
@AllArgsConstructor
class ChessmanMemento {

    private String label;
    private int x;
    private int y;

}
