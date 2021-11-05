package com.kais.designpattern.template_mode;

/**
 * @Author liuxiankai
 * @ClassName TemplateTest
 * @CreateTime 2021-09-26 13:51
 * @Description: 客户端测试
 */
public class TemplateTest {

    public static void main(String[] args) {
        System.out.println("Java课程start---");
        ACourse javaCourse = new JavaCourse();
        javaCourse.makeCourse();
        System.out.println("Java课程end---n");


        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end---");
    }

}
