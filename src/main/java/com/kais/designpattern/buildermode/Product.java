package com.kais.designpattern.buildermode;

/**
 * @Author liuxiankai
 * @ClassName Produce
 * @CreateTime 2021-08-31 11:04
 * @Description: 产品角色：包含多个组成部件的复杂对象，房子
 */
class Product {
    /**
     * 产品角色包含的各个组件
    */
    private String buildA;
    private String buildB;
    private String buildC;
    private String buildD;
    private Product product;

    public String getBuildA() {
        return buildA;
    }
    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }
    public String getBuildB() {
        return buildB;
    }
    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }
    public String getBuildC() {
        return buildC;
    }
    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }
    public String getBuildD() {
        return buildD;
    }
    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }
    @Override
    public String toString() {
        return buildA+"\n"+buildB+"\n"+buildC+"\n"+buildD+"\n"+"房子验收完成";
    }

    public Product getProduct() {
        return product;
    }
}