package org.kovan.intern.the_pro_stack.build_tools_and_dependency_management;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void divisionByZeroShouldThrowException() {

        Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    void normalDivisionShouldReturnCorrectResult() {

        Calculator calculator = new Calculator();

        assertEquals(5, calculator.divide(10, 2));
    }
}