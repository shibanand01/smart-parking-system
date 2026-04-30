package com.parking.customer;

public class Customer {
    private String name, email_id, DL;
    private long phoneNo;

    @Override
    public String toString(){
        return this.name +" : "+this.email_id+" : "+ this.phoneNo+" : "+ this.DL;
    }

    //getter
    public String getName(){
        return this.name;
    }
    public long getPhoneNo(){
        return this.phoneNo;
    }
    public String getEmail_id(){
        return this.email_id;
    }

}
