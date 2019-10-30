package com.company.structure.decorative;

public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void basicOperation() {
        component.basicOperation();
    }
}
