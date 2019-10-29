package com.company.structure.bridge;

public class Client {
    public static void main(String args[]){
        Road road = new CementRoad(new Car());
        road.driveOnRoad();
    }
}
