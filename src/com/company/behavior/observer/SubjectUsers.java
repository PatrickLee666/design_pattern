package com.company.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectUsers implements Subject {
    //一个队列用来保存所有的观察者对象
    List<Observer> list = new ArrayList<>();


    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : list){
            observer.watch(message);
        }
    }
}
