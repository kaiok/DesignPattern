package com.kais.designpattern.compositemode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liuxiankai
 * @ClassName Folder
 * @CreateTime 2021-09-08 10:15
 * @Description: 文件夹类，用于存储该文件夹下的文件和子文件夹
 * 1.容器构件类
 * 2.Folder与Component是聚合关系
 */
public class Folder extends Component {

    private String name;
    private List<Component> componentList = new ArrayList<Component>();
    private Integer level;

    Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * 方法描述:add方法，将文件加入当前文件夹中
     *
 * @param component
     * @返回值 : void
     * @作者 : lxk
     * 时间:2021/9/8 10:34
    */
    @Override
    public void add(Component component) {
        this.componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentList.remove(component);
    }

    @Override
    public void print() {
        //输出根文件夹名称
        System.out.println(this.getName());
        //当文件夹级别为0，也就是根文件夹，给其等级赋值为1
        if (this.level == null) {
            this.level = 1;
        }
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < this.level; i++) {
            prefix.append("t- ");
        }
        for (Component component : this.componentList) {
            if (component instanceof Folder){
                ((Folder)component).level = this.level + 1;
            }
            System.out.print(prefix);
            //
            component.print();
        }
        this.level = null;
    }

}
