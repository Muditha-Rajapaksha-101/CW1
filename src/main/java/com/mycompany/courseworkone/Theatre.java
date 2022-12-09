package com.mycompany.courseworkone;

import java.sql.Time;
import java.util.ArrayList;

public class Theatre extends Attraction{

    int noOfSeats;
    ArrayList<Movie> movies;
    
     public Theatre(String name , String location ,float admittancePrice, String openingTime, String closingTime) {
        super(name , location , admittancePrice, openingTime, closingTime);
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

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void addMovies(Movie movie) {
        this.movies.add(movie);
    }
    
    public void playMovies(){
        for (Movie m : this.movies) {
            m.playMovie();
        }
    }
    
}
