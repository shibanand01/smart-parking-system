package com.parking.customer;

import java.util.regex.Pattern;

public class Validation {
    public boolean checkEmail(String email){
        String regex = "^[a-z0-9]+(/.[a-zA-Z0-9._%+-]+)*@[a-zA-Z0-9-]+(/.[a-zA-Z0-9-]+)*$";

        return Pattern.matches(regex,email);
    }

    public boolean checkPhone(long phno){
        return phno< 10000000000L && phno> 999999999L;
    }

}
