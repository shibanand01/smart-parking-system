package com.parking.vehicle;

public class Controller {
    //Vehicle class reff
    private Validation isValid;

    //Constructor to instantiate Vehicle
    public Controller(){
        this.isValid = new Validation();
    }

    //validity checker
    public boolean validateReg(String registrationNumber)
    {
        return isValid.checkReg(registrationNumber);
    }
    public boolean validateType(VehicleType type)
    {
        return isValid.checkType(type);
    }

    //Create Vehicle
    public Vehicle createVehicle(String reg, VehicleType type)
    {
        if (!validateReg(reg) || !validateType(type)){
            System.out.println("Invalid - Input");
            return null;
        }
        else{
            System.out.println("Vehicle Registered Successfully!");
            return new Vehicle(reg, type);
        }
    }

    public static void main(String[] args) {
        InputHandler input = new InputHandler();
        Controller control = new Controller();
        String reg = input.getRegistration();
        VehicleType type = input.getType();
        Vehicle v1  = control.createVehicle(reg,type);
        System.out.println(v1);
    }
}
