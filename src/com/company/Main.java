package com.company;

public class Main {

    public static void main(String[] args) {

       Boss boss = new Boss(500, 100);
       boss.weapon.setName("pistolet");
       boss.weapon.setType("ognestr");


        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton(400, 70, 200);
        skeleton.weapon.setName("luk");
        skeleton.weapon.setType("holodnoe");

        System.out.println( skeleton.printInfo());


        Skeleton skeleton1 = new Skeleton(500, 80, 150);
        skeleton1.weapon.setName("luk");
        skeleton1.weapon.setType("holodnoe");

        System.out.println( skeleton1.printInfo());
    }

}
