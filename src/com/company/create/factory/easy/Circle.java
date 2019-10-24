package com.company.create.factory.easy;

public class Circle implements Shape {
    public Circle() {
        System.out.println("Circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
