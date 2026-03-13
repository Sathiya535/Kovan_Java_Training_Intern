package org.kovan.intern.the_pro_stack.build_tools_and_dependency_management;

public class Rogue extends Character {

    public Rogue(String name) {
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