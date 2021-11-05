package com.kais.designpattern.Iterator_mode;

/**
 * @Author liuxiankai
 * @ClassName StudentAggregate
 * @CreateTime 2021-09-27 13:50
 * @Description: 定义班级接口
 */
public interface StudentAggregate {
    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
