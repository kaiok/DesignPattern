package com.kais.designpattern.memopattern;

/**
 * @Author liuxiankai
 * @ClassName Client
 * @CreateTime 2021-09-14 10:38
 * @Description: 棋子客户端，维护了一个MementoCaretaker对象
 */
public class Client {

    private static int index = -1;
    private static MementoCaretaker mc = new MementoCaretaker();

    public static void main(String[] args) {

        Chessman chess = new Chessman("车",1,1);
        play(chess);
        chess.setY(4);
        play(chess);
        chess.setX(5);
        play(chess);
        undo(chess, index);
        undo(chess, index);
        redo(chess, index);
        redo(chess, index);
    }

    /**
     * 方法描述:下棋，同时保存备忘录
     *
 * @param chess
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/14 10:40
    */
    private static void play(Chessman chess) {
        mc.addMemento(chess.save());
        index++;
        chess.show();
    }

    /**
     * 方法描述:悔棋，撤销到上一个备忘录
     *
 * @param chess
 * @param i
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/14 10:41
    */
    private static void undo(Chessman chess, int i) {
        System.out.println("******悔棋******");
        index--;
        chess.restore(mc.getMemento(i - 1));
        chess.show();
    }

    /**
     * 方法描述:撤销悔棋，恢复到下一个备忘录
     *
 * @param chess
 * @param i
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/14 10:58
    */
    private static void redo(Chessman chess, int i) {
        System.out.println("******撤销悔棋******");
        index++;
        chess.restore(mc.getMemento(i + 1));
        chess.show();
    }
}
