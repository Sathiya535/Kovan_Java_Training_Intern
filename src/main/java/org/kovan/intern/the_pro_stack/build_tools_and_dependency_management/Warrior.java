package org.kovan.intern.the_pro_stack.build_tools_and_dependency_management;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 150, 20);
    }

    @Override
    public void attack(Character enemy) {
        int damage = strength + random.nextInt(10);
        System.out.println(name + " attacks with sword for " + damage + " damage");
        enemy.takeDamage(damage);
    }
}
