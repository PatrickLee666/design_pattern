package com.company.behavior.visitor;

class A {
    public void method1(){
        System.out.println("我是A");
    }

    public void method2(B b){
        b.showA(this);
    }
}

class B {
    public void showA(A a){
        a.method1();
    }
}

public class Test {

    public static void main(String[] args){
        A a = new A();
        a.method1();
        a.method2(new B());
    }

}
