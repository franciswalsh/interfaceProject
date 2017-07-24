package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NavySeal navySeal = new NavySeal("John", "private", 1);
        Marine marine = new Marine("Bob", "gereral", 2);
        Enemy enemy = new Enemy("Bill", "corporal", 3);

        System.out.println(navySeal.speak());
        System.out.println(marine.speak());
        System.out.println(enemy.speak());
        System.out.println(navySeal.bombLocation("enemy territory").toString());
        System.out.println(enemy.kick(navySeal));
        System.out.println(marine.shoot(enemy));
        System.out.println(enemy.getShot(marine));
        System.out.println(enemy.bombLocation("Naval base").toString());
        System.out.println(enemy.karateKick(marine));
        System.out.println(enemy.stab(navySeal));

    }
}
