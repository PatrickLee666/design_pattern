package com.company.behavior.template;

public class ConcreteTemplate extends AbstractTemplate {

    @Override
    public void fatherDo() {
        super.fatherDo();
        System.out.println("子类重写父类的非抽象方法");
    }

    @Override
    public void sonDo() {
        System.out.println("子类实现父类的抽象方法");
    }
}
