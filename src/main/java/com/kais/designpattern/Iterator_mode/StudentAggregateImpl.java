package com.kais.designpattern.Iterator_mode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liuxiankai
 * @ClassName StudentAggregateImpl
 * @CreateTime 2021-09-27 13:50
 * @Description: 班级类
 */
public class StudentAggregateImpl implements StudentAggregate {
    //学生列表
    private List<Student> list;

    StudentAggregateImpl() {
        this.list = new ArrayList<Student>();
    }

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
