package com.company;

/**
 * Created by franciswalsh on 7/24/17.
 */
public interface PhysicalCombat {

    public String punch(Soldier soldier);
    public String kick(Soldier soldier);
    default String karateKick(Soldier soldier){
        return soldier.getName() + " was just karate kicked";
    }

}
