package com.kais.designpattern.template_mode;

/**
 * @Author liuxiankai
 * @ClassName FECourse
 * @CreateTime 2021-09-26 13:50
 * @Description: 子类 FECourse，实现了抽象方法 packageCourse，重写了钩子方法 needWriteArticle，
 *      其中把钩子方法的结果交给客户端确定
 */
public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;
    @Override
    void packageCourse() {
        System.out.println("4.1 提供课程的前端代码");
        System.out.println("4.2 提供课程的图片等多媒体素材");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
