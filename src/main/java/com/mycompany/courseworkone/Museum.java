package com.mycompany.courseworkone;

import java.sql.Time;

public class Museum extends Attraction {

    String museumType;
    
    public Museum(String name , String location , float admittancePrice, String openingTime, String closingTime) {
        super(name, location , admittancePrice, openingTime, closingTime);
        
        this.name = name;
        this.location = location;
        this.admittancePrice = admittancePrice;
        this.openingTime = Time.valueOf(openingTime);
        this.closingTime = Time.valueOf(closingTime);
    }
    
    @Override
    public float getAdmittancePrice() {
        return this.admittancePrice;
    }

    @Override
    public void setAdmittancePrice(float admittancePrice) {
        this.admittancePrice = admittancePrice;
    }

    public String getMuseumType() {
        return museumType;
    }

    public void setMuseumType(String museumType) {
        this.museumType = museumType;
    }
    
    
    
}
