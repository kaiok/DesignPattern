package com.kais.designpattern.chain_of_responsibility_mode;

/**
 * @Author liuxiankai
 * @ClassName Client
 * @CreateTime 2021-09-26 9:52
 * @Description: 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        //创建责任链中具体处理者对象
        Handler zhangsan = new Director("张三");
        Handler lisi = new Manager("李四");
        Handler wangwu = new TopManager("王五");

        // 创建责任链
        zhangsan.setNextHandler(lisi);
        lisi.setNextHandler(wangwu);

        // 发起请假申请
        boolean result1 = zhangsan.process(new LeaveRequest("小旋锋", 1));
        System.out.println("最终结果：" + result1 + "n");

        boolean result2 = zhangsan.process(new LeaveRequest("小旋锋", 4));
        System.out.println("最终结果：" + result2 + "n");

        boolean result3 = zhangsan.process(new LeaveRequest("小旋锋", 8));
        System.out.println("最终结果：" + result3 + "n");
    }
}
