package com.company.structure.bridge;

public interface Vehicle {
    void drive();
}

class Car implements Vehicle{

    @Override
    public void drive() {
        System.out.println("小轿车滴滴滴");
    }
}

class Bus implements Vehicle{

    @Override
    public void drive() {
        System.out.println("公交车轰隆隆");
    }
}
