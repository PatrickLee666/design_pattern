package com.company.create.single;

/**
 * 单例模式
 */
public class Singleton {



}

/**
 * 懒汉
 * 饿汉
 * 静态内部类
 * 枚举单例
 */
//饿汉
class Singleton1{
    /**
     * 这里加static是保证只有一份实例
     * 这里加volatile是防止重排序，因为new singleton()分成了三步：
     * 1。开辟内存
     * 2。内存初始化
     * 3。引用指向内存
     * 而2，3可能发生重排序，导致可能返回的对象指向了一个还没有初始化的内存导致错误
     */
    private static volatile Singleton1 singleton1;

    private Singleton1(){}

    public static Singleton1 getInstance(){
        if (singleton1 == null){//1.在外部判断，如果初始化直接返回，避免加锁消耗多余时间
            synchronized (Singleton1.class){//2.加锁，只能让一个线程进行实例化
                if (singleton1 == null){//3.再做一此判断，因为可能第一个线程执行完实例化后，有多个其他线程已经在同步块阻塞，这里进行一次判空防止多次实例化
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }

}

//静态内部类，懒汉
class Singleton2{

    private static class Instance{
        private static final Singleton2 s = new Singleton2();
    }

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return Instance.s;
    }

}

//饿汉，枚举，默认私有方法
enum Singleton3{
    INSTANCE
}