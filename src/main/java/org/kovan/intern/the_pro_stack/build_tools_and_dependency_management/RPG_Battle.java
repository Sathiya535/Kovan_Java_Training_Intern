package org.kovan.intern.the_pro_stack.build_tools_and_dependency_management;

import com.google.gson.Gson;

public class RPG_Battle {

    public static void main(String[] args) {

        Character player1 = new Warrior("Sathiya");
        Character player2 = new Mage("Priya");

        Arena.fight(player1, player2);


        PlayerSave save = new PlayerSave(
                player1.name,
                player1.health,
                player1.strength
        );

        Gson gson = new Gson();
        String json = gson.toJson(save);

        System.out.println("\nJSON Output:");
        System.out.println(json);
    }
}