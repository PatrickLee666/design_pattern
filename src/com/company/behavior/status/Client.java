package com.company.behavior.status;

//客户端类
public class Client {

    /**
     * Context通过request方法委派给具体的实现类，通过给定不同的State实现类执行对应的多态方法
     */
    public static void main(String[] args){
        //创建状态
        State state = new ConcreteStateB();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
    }

}
