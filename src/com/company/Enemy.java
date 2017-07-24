package com.company;

import javax.swing.*;

/**
 * Created by franciswalsh on 7/24/17.
 */
public class Enemy extends Soldier implements Bomber, PhysicalCombat, Shootout, BladeAttack, KnifeAttack {

    public Enemy(String name, String rank, int serialNumber){
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
    public String stab(Soldier soldier){
        return "I just stabbed " + soldier.getName();
    }
//    @Override
//    public int stabDamage(int stabPower){
//        //this gets an error
//    }

    @Override
    public String speak() {
        return "I will destroy you!";
    }

}
