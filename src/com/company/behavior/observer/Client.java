package com.company.behavior.observer;

public class Client {


    public static void main(String[] a){
        //定义观察者
        Observer observer = new ObserverUsers("小明");
        Observer observer1 = new ObserverUsers("小红");

        //定义发布者并添加观察者
        Subject subject = new SubjectUsers();
        subject.addObserver(observer);
        subject.addObserver(observer1);

        //被观察者通知
        subject.notifyObservers("通知");

    }

}
