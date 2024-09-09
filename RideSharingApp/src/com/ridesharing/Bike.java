package com.ridesharing;

class Bike implements Vehicle { 
    public void drive() { 
        System.out.println("Riding a bike."); 
    } 
}

class Scooter implements Vehicle { 
    public void drive() { 
        System.out.println("Riding a scooter."); 
    } 
}
