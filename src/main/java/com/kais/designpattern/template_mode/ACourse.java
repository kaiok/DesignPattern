package com.kais.designpattern.template_mode;

/**
 * @Author liuxiankai
 * @ClassName ACourse
 * @CreateTime 2021-09-26 13:43
 * @Description: 抽象课程类的定义
 * 其中1、2、3的实现在抽象类中完成，3的执行与否则由子类通过钩子方法来控制，4则由子类来实现
 */
public abstract class ACourse {

    /**
     * 方法描述:模板方法，定义了制作网课的基本流程，且将流程方法定义为final格式
     *
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/26 13:46
    */
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("1. 制作PPT");
    }

    final void makeVideo() {
        System.out.println("2. 制作视频");
    }

    final void writeArticle() {
        System.out.println("3. 编写课程笔记");
    }

    /**
     * 方法描述:钩子方法：添加逻辑判断该课程是否需要步骤3
     *
     * @返回值 : boolean
     * @作者 : lxk
     * 时间:2021/9/26 13:49
    */
    protected boolean needWriteArticle() {
        return false;
    }

    /**
     * 方法描述:提供课程资料步骤，视具体情况而定，定义为抽象类型
     *
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/26 13:48
    */
    abstract void packageCourse();
}
