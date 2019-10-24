package com.company.create.factory.abstract_factory;

public class IosOperationController implements OperationController {
    @Override
    public void control() {
        System.out.println("IosOperationController");
    }
}