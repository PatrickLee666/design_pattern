package com.company.create.builder;

/**
 * 指挥组装流程
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer createComputer(String cpu,String hardDisk,String mainBoard,String memory){
        // 具体的工作是装机工去做
        this.builder.createMainBoard(mainBoard);
        this.builder.createCpu(cpu) ;
        this.builder.createMemory(memory);
        this.builder.createhardDisk(hardDisk);
        return this.builder.createComputer() ;
    }


}
