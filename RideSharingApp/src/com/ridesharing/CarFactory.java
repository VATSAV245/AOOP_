package com.ridesharing;

class CarFactory extends VehicleFactory { 
    public Vehicle createVehicle() { 
        return new Car(); 
    } 
}
