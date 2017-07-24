package com.company;

/**
 * Created by franciswalsh on 7/24/17.
 */
public abstract class Soldier {

    private String name;
    private String rank;
    private int serialNumber;

    public Soldier(String name, String rank, int serialNumber){
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String eat(){
        return "Chew";
    }

    public String sleep(){
        return "Snore";
    }

    public String walk(){
        return "Trudge";
    }

    public abstract String speak();
}
