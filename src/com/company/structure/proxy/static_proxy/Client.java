package com.company.structure.proxy.static_proxy;

/**
 * 这里模仿了一个律师帮助当事人打官司的场景
 * 客户端只需要让律师代理即可
 */
public class Client {

    public static void main(String args[]){
        Speak speak = new Lawyer(new People());
        speak.speak();
    }

}
