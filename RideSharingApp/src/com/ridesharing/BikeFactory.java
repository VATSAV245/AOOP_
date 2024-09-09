package com.ridesharing;

class BikeFactory extends VehicleFactory { 
    public Vehicle createVehicle() { 
        return new Bike(); 
    } 
}

class ScooterFactory extends VehicleFactory { 
    public Vehicle createVehicle() { 
        return new Scooter(); 
    } 
}
