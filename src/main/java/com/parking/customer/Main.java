package com.parking.customer;

public class Main {
    InputHandler input;
    Validation validate;
    boolean flag;

    Main()
    {
        input = new InputHandler();
        validate = new Validation();
    }
    public boolean control(){
        String name = input.inputName();
        String email = input.inputEmail();
        String phone = input.inputPhoneNO();
        if (!validate.checkEmail(email))
        {
            System.out.println("Invalid Email!");
            return false;
        }
        else if(!validate.checkPhone(phone))
        {
            System.out.println("Invalid Phone Number!");
            return false;
        }
        else
        {
            Customer c1 = new Customer(name, email, phone);
            return true;
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        do{
            m.flag = m.control();
        }
        while(!m.flag);
    }

}
