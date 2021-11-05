package com.kais.designpattern.template_mode;

/**
 * @Author liuxiankai
 * @ClassName JavaCourse
 * @CreateTime 2021-09-26 13:49
 * @Description: 子类JavaCourse课程
 * 实现了抽象方法 packageCourse，重写了钩子方法 needWriteArticle
 */
public class JavaCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("4. 提供Java课程源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
