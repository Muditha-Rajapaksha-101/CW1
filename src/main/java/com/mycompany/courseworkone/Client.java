package com.mycompany.courseworkone;

import java.util.ArrayList;
import java.sql.Time;

public class Client {
    public static void main(String[] vargs){
        System.out.println("Hii , This is Course Work 1 - ASD");
        ArrayList<Attraction> data = createDataList();
        
        for (Attraction a : data) {
            if(a.getAdmittancePrice()< 5 && a.isOpenAt("20:00:00") ){
                System.out.println(a.getName());
       
            }
        }
        
        
    }
    
    private static ArrayList<Attraction> createDataList(){
        ArrayList<Attraction> data = new ArrayList<Attraction>();
        Attraction a1 = new Park( "ABC Park" , "Colombo" ,0 , "08:00:00" ,"21:00:00");
        Attraction a2 = new Theatre( "Lite Cinema" , "Galle" ,12 , "08:00:00" ,"21:00:00");
        Attraction a3 = new Theatre( "Lite Cinema" , "Galle" ,5 , "08:00:00" ,"21:00:00");
        Attraction a4 = new Museum( "Old House Museum" , "Colombo" ,2 , "09:00:00" ,"21:00:00");
        Attraction a5 = new Park( "Sand Park" , "Kandy" ,0 , "14:00:00" ,"21:00:00");
        Attraction a6 = new Museum( "Ancient House Museum" , "Kandy" ,4 , "09:00:00" ,"16:00:00");
        
        data.add(a1);
        data.add(a2);
        data.add(a3);
        data.add(a4);
        data.add(a5);
        data.add(a6);  
        
        return data;
        
    }
        
}
