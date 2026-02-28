package org.kovan.intern.the_pro_stack.build_tools_and_dependency_management;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 90, 35);
    }

    @Override
    public void attack(Character enemy) {
        int damage = strength + random.nextInt(20);
        System.out.println(name + " casts magic for " + damage + " damage");
        enemy.takeDamage(damage);
    }
}
