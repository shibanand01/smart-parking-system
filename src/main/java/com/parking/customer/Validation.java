package com.parking.customer;

import java.util.regex.Pattern;

public class Validation {
    public boolean checkEmail(String email){
        String regex = "^[a-z0-9]+(\\.[a-zA-Z0-9._%+-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*$";

        return Pattern.matches(regex,email);
    }

    public boolean checkPhone(String phno){
        String regex = "^[0-9]{10}$";
        return Pattern.matches(regex, phno);
    }

}
