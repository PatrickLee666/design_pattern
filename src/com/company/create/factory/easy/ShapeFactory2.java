package com.company.create.factory.easy;

public class ShapeFactory2 {
    public static Object getClass(Class<? extends Shape> clazz){
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
