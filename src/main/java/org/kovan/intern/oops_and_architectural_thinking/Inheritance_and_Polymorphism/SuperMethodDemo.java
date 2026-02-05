package org.kovan.intern.oops_and_architectural_thinking.Inheritance_and_Polymorphism;

import org.w3c.dom.ls.LSOutput;

class Animal{
    String species;
    int age;
    Animal(String species,int age){
        this.species=species;
        this.age=age;
    }
    void eat(){
        System.out.println("Animal Eating...");

    }
    void sleep(){
        System.out.println("Animal Sleeping");

    }
    void showDetails(){
        System.out.println("Species of Animal "+species);
        System.out.println("Age of the Animal "+age);

    }

}
class Dog extends Animal {


    String breed;


    Dog(String species, int age, String breed) {
        super(species, age); // call parent constructor
        this.breed = breed;
    }



    void eat() {
        System.out.println("Dog is eating dog food");
    }


    void bark() {
        System.out.println("Dog is barking");
    }

    void showDogDetails() {
        super.showDetails();
        System.out.println("Breed: " + breed);
    }
}


public class SuperMethodDemo {
    public static void main(String[] args){
        Dog dog = new Dog("Mammal", 3, "German Shepherd");

        dog.showDogDetails(); // parent + child state
        dog.eat();            // overridden method
        dog.sleep();          // inherited method
        dog.bark();           // child-specific method

    }
}
