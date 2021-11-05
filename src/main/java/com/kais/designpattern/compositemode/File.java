package com.kais.designpattern.compositemode;

/**
 * @Author liuxiankai
 * @ClassName File
 * @CreateTime 2021-09-08 10:16
 * @Description: 文件类File，继承Component父类
 * 1.叶子构件类
 */
public class File extends Component {

    private String name;
    private String content;

    File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.getName());
    }

    @Override
    public String getContent() {
        return this.content;
    }

}
