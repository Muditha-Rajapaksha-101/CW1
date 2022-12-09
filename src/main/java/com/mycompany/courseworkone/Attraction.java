/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.courseworkone;
import java.util.Date;
import java.sql.Time;
        
/**
 *
 * @author Scorpion
 */
public abstract class Attraction {
    
    String name;
    String location;
    float admittancePrice;
    Time openingTime;
    Time closingTime;

    public Attraction(String name, String location, float admittancePrice, String openingTime, String closingTime) {
        this.name = name;
        this.location = location;
        this.admittancePrice = admittancePrice;
        this.openingTime = Time.valueOf(openingTime);
        this.closingTime = Time.valueOf(closingTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public abstract float getAdmittancePrice();

    public abstract void setAdmittancePrice(float admittancePrice) ;

    public Time getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(Time openingTime) {
        this.openingTime = openingTime;
    }

    public Time getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        //TO make the code simple to the Client , time is taken as an string input
        // Ex : "18:45:20
        Time t1 = Time.valueOf(closingTime);
        this.closingTime = t1;
    }
    
    public boolean isOpenAt(String requestTime){
        Time  time = Time.valueOf(requestTime);
        
        boolean openAfter = time.getTime() >= this.openingTime.getTime();
        boolean closeBefore = time.getTime() <= this.closingTime.getTime();
        
        if(openAfter && closeBefore ){
            return true;
        }else{
            return false;
        }  
        
    }
    
}
