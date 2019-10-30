package com.company.structure.decorative;

public class DecoratorComponent extends Decorator {

    public DecoratorComponent(Component component) {
        super(component);
    }

    @Override
    public void basicOperation() {
        super.basicOperation();
        System.out.println("装饰器新增功能1");
    }
}
