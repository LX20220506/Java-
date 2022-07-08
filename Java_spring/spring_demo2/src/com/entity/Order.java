package com.entity;

public class Order {

    public Order(){
        System.out.println("第一步，执行无参数构造创建 bean 实例");
    }

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步 调用 set 方法设置属性值");
    }

    /**
     * 需要在xml中配置
     * 配置完成后，这个方法会自动调用
     */
    public void initMethod(){
        System.out.println("第三步 执行初始化的方法");
    }

    /**
     * 需要在xml中配置
     * 这个方法需要ClassPathXmlApplicationContext对象手动调用
     */
    public void destroyMethod(){
        System.out.println("第五步 执行销毁的方法");
    }


}
