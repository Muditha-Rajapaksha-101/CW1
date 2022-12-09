package com.mycompany.courseworkone;

public class Movie {
    String name;
    String screenTime;

    public Movie(String name, String screenTime) {
        this.name = name;
        this.screenTime = screenTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenTime() {
        return screenTime;
    }

    public void setScreenTime(String screenTime) {
        this.screenTime = screenTime;
    }
    
    public void playMovie(){
        System.out.println("Playing Movie " +this.name );
    }
}
