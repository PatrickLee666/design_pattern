package com.company.behavior.observer;

//被观察者
public interface Subject {

    //增加观察者
    void addObserver(Observer observer);


    //删除观察者
    void deleteObserver(Observer observer);


    //通知观察者
    void notifyObservers(String message);

}
