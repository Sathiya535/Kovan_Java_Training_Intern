package org.kovan.intern.oops_and_architectural_thinking.Inheritance_and_Polymorphism;
class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;

    }
    double add(double a,double b){
        return a+b;
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println("adding 2 numbers "+cal.add(10,20));
        System.out.println("adding 3 numbers "+cal.add(10,20,30));
        System.out.printf("adding 2 double data type numbers %.4f\n",cal.add(17.13,17));


    }
}
