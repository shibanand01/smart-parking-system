package com.parking.customer;

public class Customer {
    private String name, email_id;
    private String phoneNo;

    Customer(String name, String email_id, String phone){
        this.name = name;
        this.email_id = email_id;
        this.phoneNo = phone;
    }

    @Override
    public String toString(){
        return this.name +" : "+this.email_id+" : "+ this.phoneNo;
    }

    //getter
    public String getName(){
        return this.name;
    }
    public String getPhoneNo(){
        return this.phoneNo;
    }
    public String getEmail_id(){
        return this.email_id;
    }

}
