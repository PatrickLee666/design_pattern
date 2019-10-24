package com.company.create.prototype.easy;

public class Client {

    public static void main(String[] args) {
        try {
            // 创建第一个实例
            Prototype p1 = new ConcretePrototype();
            // 注册第一个实例
            PrototypeManager.setProtoType("p1", p1);

            // 克隆第一个实例的原型
            Prototype p3 = PrototypeManager.getPrototype("p1").cloned();
            System.out.println("第一个实例的副本：" + p3);

            // 创建第二个实例
            Prototype p2 = new ConcretePrototype2();
            // 注册第二个实例
            PrototypeManager.setProtoType("p2", p2);

            // 克隆第二个实例的原型
            Prototype p4 = PrototypeManager.getPrototype("p2").cloned();

            System.out.println("第二个实例的副本：" + p4);

            // 注销第一个实例
            PrototypeManager.removePrototype("p1");
            // 再次克隆第一个实例的原型
            Prototype p5 = PrototypeManager.getPrototype("p1").cloned();
            System.out.println("第一个实例的副本：" + p5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
