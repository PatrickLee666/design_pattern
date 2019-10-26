package com.company.behavior.observer;

public class ObserverUsers implements Observer {
    //观察者的名字
    String name;

    public ObserverUsers(String name) {
        this.name = name;
    }

    @Override
    public void watch(String message) {
        System.out.println("观察者： "+name+" 收到信息："+message);
    }
}
