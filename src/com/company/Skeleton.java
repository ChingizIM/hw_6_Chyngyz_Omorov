package com.company;

public class Skeleton extends Boss{
    private int strely ;

    public int getStrely() {
        return strely;
    }

    public void setStrely(int strely) {
        this.strely = strely;
    }

    public Skeleton(int health, int damage, int strely) {
        super(health, damage);
        this.strely = strely;


    }
    public String printInfo() {
        return super.printInfo() + " " + strely;
    }
}
