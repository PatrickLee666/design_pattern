package com.company.structure.proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class Client {
    public static void main(String args[]){
        Subject subject = new SubjectImplement();
        DynamicProxy dynamicProxy = new DynamicProxy(subject);
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Subject sub = (Subject) Proxy.newProxyInstance(classLoader,new Class[]{Subject.class},dynamicProxy);
        sub.doSomthing();
    }
}
