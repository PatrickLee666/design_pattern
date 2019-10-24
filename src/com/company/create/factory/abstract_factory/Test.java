package com.company.create.factory.abstract_factory;

public class Test {

    public static void main(String args[]){
        SystemFactory mFactory;
        UIController interfaceController;
        OperationController operationController;

        //Android
        mFactory=new AndroidFactory();
        //Ios
        mFactory=new IosFactory();
        //Wp
        mFactory=new WpFactory();

        interfaceController=mFactory.createInterfaceController();
        operationController=mFactory.createOperationController();
        interfaceController.display();
        operationController.control();
    }

}
