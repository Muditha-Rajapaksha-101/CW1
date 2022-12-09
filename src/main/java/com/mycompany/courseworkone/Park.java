package com.mycompany.courseworkone;
import java.util.Date;
import java.sql.Time;

public class Park extends Attraction{
   
    int noOfTrees;
            
    public Park(String name , String location , float admittancePrice, String openingTime, String closingTime) {
        super(name , location , admittancePrice, openingTime, closingTime);
        
        this.setAdmittancePrice(admittancePrice);       
        this.name = name;
        this.location = location;
        this.openingTime = Time.valueOf(openingTime);
        this.closingTime = Time.valueOf(closingTime);
    }
    

    @Override
    public float getAdmittancePrice() {
         return this.admittancePrice;
    }

    @Override
    public void setAdmittancePrice(float admittancePrice) {
        if(admittancePrice>0){
            throw new UnsupportedOperationException("Not supported.");
        }else{
            this.admittancePrice = admittancePrice;
        }
    }

    public int getNoOfTrees() {
        return noOfTrees;
    }

    public void setNoOfTrees(int noOfTrees) {
        this.noOfTrees = noOfTrees;
    }
    
    
}
