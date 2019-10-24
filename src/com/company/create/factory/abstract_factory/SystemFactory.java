package com.company.create.factory.abstract_factory;

public interface SystemFactory {
    OperationController createOperationController();
    UIController createInterfaceController();
}
