package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas;

import java.util.function.Consumer;

class Person{
    private String name;

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }
}

public class ConsumerInterface {
    public static void main(String[] args){

        Person p = new Person();
        //Consumer<T> is a Functional Interface
        //Takes input
        //Performs action
        Consumer<Person> setName = t -> t.setName("Sathiya");
        setName.accept(p);
        System.out.println(p.getName());
}
}
