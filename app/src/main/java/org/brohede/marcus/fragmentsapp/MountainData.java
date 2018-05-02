package org.brohede.marcus.fragmentsapp;

/**
 * Created by jacobsvensson on 2018-05-02.
 */

public class MountainData {
    private String name;
    private int height;
    private String location;
    private String url;

    public MountainData (String name, int height, String location,
                     String url) {
        this.name=name;
        this.height=height;
        this.location=location;
        this.url=url;
    }

    public String utmatare() {
        return name + " is part of the " + location +  " mountains range and is " +  Integer.toString(height) + "m high.";
    }


    public String getName(){
        return name;
    }

    public int getHeight(){
        return height;
    }

    public String getLocation(){
        return location;
    }

    public String getImage(){
        return url;
    }


    @Override
    public String toString() {
        return name;
    }

}
