package com.company.create.factory.easy;

public class Square implements Shape {
    public Square() {
        System.out.println("Square");
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
