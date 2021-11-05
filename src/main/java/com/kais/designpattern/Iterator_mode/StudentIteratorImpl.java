package com.kais.designpattern.Iterator_mode;

import java.util.List;

/**
 * @Author liuxiankai
 * @ClassName StudentIteratorImpl
 * @CreateTime 2021-09-27 13:51
 * @Description: 实现迭代器
 */
public class StudentIteratorImpl implements StudentIterator{
    private List<Student> list;
    private int position = 0;

    StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hashNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student currentStudent = list.get(position);
        position ++;
        return currentStudent;
    }
}
