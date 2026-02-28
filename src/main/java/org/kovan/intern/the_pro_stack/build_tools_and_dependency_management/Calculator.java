package org.kovan.intern.the_pro_stack.build_tools_and_dependency_management;

public class Calculator {

    public int divide(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return a / b;
    }
}