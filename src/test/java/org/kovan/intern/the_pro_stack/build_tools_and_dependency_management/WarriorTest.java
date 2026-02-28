package org.kovan.intern.the_pro_stack.build_tools_and_dependency_management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    private Warrior warrior;

    @BeforeEach
    void setUp() {
        warrior = new Warrior("TestWarrior");
    }

    @Test
    void healthShouldNotDropBelowZero() {
        warrior.takeDamage(1000);
        assertEquals(0, warrior.health);
    }

    @Test
    void warriorShouldBeAliveInitially() {
        assertTrue(warrior.isAlive());
    }

    @Test
    void warriorShouldDieWhenHealthZero() {
        warrior.takeDamage(150);
        assertFalse(warrior.isAlive());
    }
}