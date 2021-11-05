package com.kais.designpattern.memopattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author liuxiankai
 * @ClassName Chessman
 * @CreateTime 2021-09-14 9:32
 * @Description: 原发器角色
 * 1.一个普通的类
 * 2.可以创建一个备忘录，存储当前状态/恢复其内部状态
 */

@Data
@AllArgsConstructor
class Chessman {

    private String label;
    private int x;
    private int y;

    /**
     * 方法描述:保存状态
     *
     * @返回值 : com.kais.designpattern.memopattern.ChessmanMemento
     * @作者 : lxk
     * 时间:2021/9/14 9:35
    */
    ChessmanMemento save(){
        return new ChessmanMemento(this.label,this.x,this.y);
    }

    void restore(ChessmanMemento memento){
        this.label = memento.getLabel();
        this.x = memento.getX();
        this.y = memento.getY();
    }

    void show(){
            System.out.println(String.format("棋子<%s>:当前位置为：<%d, %d>", this.getLabel(), this.getX(), this.getY()));
    }

}
