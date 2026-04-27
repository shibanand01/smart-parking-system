package com.parking.vehicle;

import java.util.Scanner;

public class InputHandler {
    private Scanner scan = new Scanner(System.in);

    public String getRegistration(){
        System.out.println("Enter Vehicle Registration Number [ex:- AB22CC9999 / 22BH0000A]:- ");
        return scan.nextLine().toUpperCase();
    }
    public VehicleType getType(){
        System.out.print("Select Vehicle Type:- 1.Bike 2.Car 3.Auto :- ");
        int option = scan.nextInt();
        scan.nextLine();

        return switch(option) {
            case 1 -> VehicleType.BIKE;
            case 2 -> VehicleType.CAR;
            case 3 -> VehicleType.AUTO;
            default -> null;
        };
    }
}
