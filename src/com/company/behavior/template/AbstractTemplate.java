package com.company.behavior.template;

public abstract class AbstractTemplate {
    public void doTemplate(){
        fatherDo();
        sonDo();
        mustFatherDo();
    }

    /**
     * 父类已实现的方法，子类需要自己实现
     */
    public void fatherDo(){

    }

    /**
     * 交给子类实现的方法
     */
    public abstract void sonDo();


    /**
     * 必须由父类实现的方法
     */
    public final void mustFatherDo(){

    }

}
