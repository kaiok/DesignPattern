package com.kais.designpattern.Iterator_mode;

/**
 * @Author liuxiankai
 * @ClassName StudentIterator
 * @CreateTime 2021-09-27 13:51
 * @Description: 定义迭代器接口
 */
public interface StudentIterator {
    boolean hashNext();
    Student next();
}