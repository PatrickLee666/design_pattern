package com.company.structure.proxy.static_proxy;

public class People implements Speak {
    @Override
    public void speak() {
        System.out.println("当事人说话");
    }
}
