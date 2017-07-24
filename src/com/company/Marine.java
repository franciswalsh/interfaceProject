package com.company;

/**
 * Created by franciswalsh on 7/24/17.
 */
public class Marine extends Soldier implements PhysicalCombat, Shootout, Bomber {

    public Marine(String name, String rank, int serialNumber){
        super(name, rank, serialNumber);
    }


    @Override
    public Bomb bombLocation(String location) {
        return new Bomb(getName(), location);
    }

    @Override
    public String shoot(Soldier soldier) {
        return "I just shot " + soldier.getName();
    }

    @Override
    public String punch(Soldier soldier) {
        return "I just punched " + soldier.getName();
    }

    @Override
    public String getShot(Soldier soldier) {
        return "I just got shot by " + soldier.getName();
    }

    @Override
    public String kick(Soldier soldier) {
        return "I just kicked " + soldier.getName();
    }

    @Override
    public String speak() {
        return "The few, the proud, the brave!";
    }
}
