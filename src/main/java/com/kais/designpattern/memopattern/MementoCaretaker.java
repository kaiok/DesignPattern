package com.kais.designpattern.memopattern;

import java.util.ArrayList;

/**
 * @Author liuxiankai
 * @ClassName MementoCaretaker
 * @CreateTime 2021-09-14 9:40
 * @Description: 负责人角色
 * 1.负责保存或展示备忘录，但没有修改备忘录的功能
 */
class MementoCaretaker {

    /**
     * 方法描述:定义一个集合来存储备忘录
     *
 * @param null
     * @返回值 :
     * @作者 : lxk
     * 时间:2021/9/14 9:41
    */
    private ArrayList<ChessmanMemento> mementoList = new ArrayList<>();

    ChessmanMemento getMemento(int i){
        return mementoList .get(i);
    }

    void addMemento(ChessmanMemento memento){
        mementoList.add(memento);
    }

}
