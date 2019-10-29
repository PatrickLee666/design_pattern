package com.company.structure.bridge;

public abstract class Road {
    protected Vehicle vehicle;

    public Road(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract void driveOnRoad();

}

class CementRoad extends Road{

    public CementRoad(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void driveOnRoad() {
        super.vehicle.drive();
        System.out.println("行驶在水泥路上");
    }
}

class MooringRoad extends Road{

    public MooringRoad(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void driveOnRoad() {
        super.vehicle.drive();
        System.out.println("行驶在泊油路上");
    }
}
