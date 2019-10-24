package com.company.create.prototype.easy;

public class ConcretePrototype2 implements Prototype {
    @Override
    public Prototype cloned() {
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        Prototype prototype = new ConcretePrototype2();
        return prototype;
    }
}
