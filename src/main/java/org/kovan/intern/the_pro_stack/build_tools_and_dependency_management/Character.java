package org.kovan.intern.the_pro_stack.build_tools_and_dependency_management;



import java.util.Random;

public abstract class Character {

    protected String name;
    protected int health;
    protected int strength;
    protected Random random = new Random();

    public Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public abstract void attack(Character enemy);
}
