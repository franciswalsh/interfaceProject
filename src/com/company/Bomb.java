package com.company;

/**
 * Created by franciswalsh on 7/24/17.
 */
public class Bomb {

    private String bombLauncher;
    private String bombLocation;

    public Bomb (String bombLauncher, String bombLocation){
        this.bombLauncher = bombLauncher;
        this.bombLocation = bombLocation;
    }

    public String getBombLauncher() {
        return bombLauncher;
    }

    public void setBombLauncher(String bombLauncher) {
        this.bombLauncher = bombLauncher;
    }

    public String getBombLocation() {
        return bombLocation;
    }

    public void setBombLocation(String bombLocation) {
        this.bombLocation = bombLocation;
    }

    public String toString(){
        return this.getBombLauncher() + " just bombed " + this.getBombLocation();
    }
}
