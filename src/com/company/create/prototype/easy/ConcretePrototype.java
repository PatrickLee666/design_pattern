package com.company.create.prototype.easy;

public class ConcretePrototype implements Prototype {
    @Override
    public Prototype cloned() {
        Prototype prototype = new ConcretePrototype();
        return prototype;
    }
}
