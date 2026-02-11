package org.kovan.intern.oops_and_architectural_thinking.The_RPG_Battle_System;
import java.util.Random;

abstract class Character {
    protected String name;
    protected int health;
    protected int strength;
    protected Random random = new Random();

    Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    // abstract method
    public abstract void attack(Character enemy);
}
class Warrior extends Character {

    Warrior(String name) {
        super(name, 150, 20);
    }

    @Override
    public void attack(Character enemy) {
        int damage = strength + random.nextInt(10);
        System.out.println(name + " attacks with sword for " + damage + " damage");
        enemy.takeDamage(damage);
    }
}
class Mage extends Character{
    Mage(String name){
        super(name,90,35);
    }
    public void attack(Character enemy){
        int damage = strength + random.nextInt(20);
        System.out.println(name + " casts magic for " + damage + " damage");
        enemy.takeDamage(damage);

    }
}
class Rogue extends Character {

    Rogue(String name) {
        super(name, 110, 25);
    }

    @Override
    public void attack(Character enemy) {
        int damage = strength + random.nextInt(15);
        System.out.println(name + " stabs for " + damage + " damage");
        enemy.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        int chance = random.nextInt(100);
        if (chance < 30) {
            System.out.println(name + " dodged the attack!");
        } else {
            super.takeDamage(damage);
        }
    }
}

class Arena {

    public static void fight(Character p1, Character p2) {
        System.out.println("⚔️ Battle Start: " + p1.name + " vs " + p2.name);
        System.out.println("--------------------------------");

        while (p1.isAlive() && p2.isAlive()) {

            p1.attack(p2);
            printHealth(p1, p2);

            if (!p2.isAlive()) break;

            p2.attack(p1);
            printHealth(p1, p2);

            System.out.println("--------------------------------");
        }

        if (p1.isAlive()) {
            System.out.println("🏆 Winner is: " + p1.name);
        } else {
            System.out.println("🏆 Winner is: " + p2.name);
        }
    }

    private static void printHealth(Character p1, Character p2) {
        System.out.println(p1.name + " HP: " + p1.health +
                " | " + p2.name + " HP: " + p2.health);
    }
}
public class BattleTest {
    public static void main(String[] args) {

        Character player1 = new Warrior("Sathiya");
        Character player2 = new Mage("Priya");

        // Polymorphism in action
        Arena.fight(player1, player2);
    }
}
