package org.kovan.intern.the_pro_stack.build_tools_and_dependency_management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    private Warrior warrior;

    @BeforeEach


    //Create test class object

//Run @BeforeEach method->Runs before every test method.

   // Run test method

    //Repeat for next test

   // Run this method before every test method->each test must run independently.
    void setUp() {
        warrior = new Warrior("TestWarrior");
    }

    @Test

//Initial health = 100
//
//Damage given = 1000
//
//100 - 1000 = -900
    void healthShouldNotDropBelowZero() {
        warrior.takeDamage(1000);
        assertEquals(0, warrior.health);
    }

    @Test
    //When Warrior is created->Health = 100
//    Constructor sets correct initial health
//isAlive() logic works
// Initial state is correct
    void warriorShouldBeAliveInitially() {
        assertTrue(warrior.isAlive());
    }

    @Test
    void warriorShouldDieWhenHealthZero() {
        warrior.takeDamage(150);
        assertFalse(warrior.isAlive());
    }
}