package com.parking.vehicle;

import java.util.regex.Pattern;

public class Validation {

    //Check if reg. no is Valid
    public boolean checkReg(String registrationNumber)
    {
        if (registrationNumber == null)
            return false;

        String regex = "[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}";
        String regex2 = "[0-9]{2}[A-Z]{2}[0-9]{4}[A-Z]{1}";

        return Pattern.matches(regex,registrationNumber) || Pattern.matches(regex2,registrationNumber);
    }
    //check if Vehicle Type is Valid
    public boolean checkType(VehicleType vehicle)
    {
        if (vehicle == null){
            return false;
        }
        else
            return true;
    }
}
