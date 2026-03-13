package org.kovan.intern.Advanced_Data_and_Exceptions.collections_deep_dive_performance;


import java.util.HashMap;
import java.util.Objects;
public class TestHashMap
{
    public static void main(String[] args) {
        HashMap<Person,Integer> hashMap= new HashMap<>();
        Person person1= new Person("Kovan");
        Person person2=new Person("Kovan");
        hashMap.put(person1,100);
        hashMap.put(person2,105);
        System.out.println(hashMap.size());

        System.out.println(person1.equals(person2));
        System.out.println(hashMap.get(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(hashMap.hashCode());
    }
}
class Person{
    String name;
    Person(String name){

        this.name=name;
    }

    @Override
    public boolean equals(Object object){
        Person person = (Person) object;
        return this.name.equals(person.name);
    }

    @Override
    public  int hashCode(){
        return Objects.hash();
    }
}