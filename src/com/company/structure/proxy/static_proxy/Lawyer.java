package com.company.structure.proxy.static_proxy;

public class Lawyer implements Speak {
    private Speak speak;

    public Lawyer(Speak speak) {
        this.speak = speak;
    }

    @Override
    public void speak() {
        System.out.println("我是当事人的律师，我的当事人可以说话");
        speak.speak();
    }
}
