package org.kovan.intern.oops_and_architectural_thinking.Enum_and_complex_state;

enum Operation {

    ADD {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },

    SUBTRACT {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },

    MULTIPLY {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    };

    // abstract method
    public abstract double apply(double x, double y);
}

// Test class
class OperationTest {
    public static void main(String[] args) {

        double a = 10;
        double b = 5;

        System.out.println("ADD: " + Operation.ADD.apply(a, b));
        System.out.println("SUBTRACT: " + Operation.SUBTRACT.apply(a, b));
        System.out.println("MULTIPLY: " + Operation.MULTIPLY.apply(a, b));
    }
}

