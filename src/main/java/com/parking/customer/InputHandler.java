package com.parking.customer;

import java.util.Scanner;

public class InputHandler {
    private Scanner scan = new Scanner(System.in);

    public String inputName(){
        System.out.print("Enter your First Name:- ");
        String first = scan.nextLine().trim();

        System.out.print("Enter your Last Name:- ");
        String last = scan.nextLine().trim();

        return (first+" "+last).toUpperCase();
    }

    public String inputEmail(){
        System.out.print("Enter Email ID:- ");
        return scan.nextLine().trim();
    }

    public long inputPhoneNO(){
        System.out.print("Enter Phone Number:- ");
        return Long.parseLong(scan.nextLine());
    }

    public String inputDL(){
        System.out.print("Enter Driving Licence Number:- ");
        return scan.nextLine().trim();
    }
}
