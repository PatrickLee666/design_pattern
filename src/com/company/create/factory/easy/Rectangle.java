package com.company.create.factory.easy;

public class Rectangle implements Shape {
    public Rectangle() {
        System.out.println("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
