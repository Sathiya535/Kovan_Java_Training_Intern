package org.kovan.intern.the_pro_stack.build_tools_and_dependency_management;

public class Arena {

    public static void fight(Character p1, Character p2) {

        System.out.println("-> Battle Start: " + p1.name + " vs " + p2.name);
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
            System.out.println(" Winner is: " + p1.name);
        } else {
            System.out.println("Winner is: " + p2.name);
        }
    }

    private static void printHealth(Character p1, Character p2) {
        System.out.println(p1.name + " HP: " + p1.health +
                " | " + p2.name + " HP: " + p2.health);
    }
}
