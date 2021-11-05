package com.kais.designpattern.Iterator_mode;

/**
 * @Author liuxiankai
 * @ClassName Test
 * @CreateTime 2021-09-27 13:52
 * @Description: 测试，进行报数
 */
public class Test {
    public static void main(String[] args) {
        StudentAggregate classOne = new StudentAggregateImpl();
        classOne.addStudent(new Student("张三", 1));
        classOne.addStudent(new Student("李四", 2));
        classOne.addStudent(new Student("王五", 3));
        classOne.addStudent(new Student("赵六", 4));

        // 遍历，报数
        StudentIterator iterator = classOne.getStudentIterator();
        while (iterator.hashNext()){
            Student student = iterator.next();
            student.count();
        }
    }
}