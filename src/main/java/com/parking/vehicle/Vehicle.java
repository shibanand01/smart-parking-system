package com.parking.vehicle;

public class Vehicle {
    private String registrationNumber;
    private VehicleType type;

    public Vehicle(String reg, VehicleType type)
    {
        this.registrationNumber = reg;
        this.type = type;
    }
    public String getRegistrationNumber()
    {
        return this.registrationNumber;
    }
    public VehicleType getType(){
        return this.type;
    }
    @Override
    public String toString(){
        return "Vehicle { Registration No.:- "+this.registrationNumber+", Type :- "+this.type+"}";
    }
}
