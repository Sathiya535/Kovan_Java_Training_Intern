package org.kovan.intern.Advanced_Data_and_Exceptions.generics_and_wildcards;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class MyStack<T>{
    private T[] stackArray;
    private int top;


    public MyStack(int size) {
        //in java ,cannot creat object directly for the generics
        //if we use the new T[size] -> compile time error
        stackArray = (T[]) new Object[size];
        top = -1;
    }
    public void push(T element){
        if(top==stackArray.length-1) {
            resize();
        }
        stackArray[++top]=element;


    }
    public T pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty...");
        }
        T removed = stackArray[top];
        //stackArray[top] = null;
        top--;
        return removed;
    }
    public T peek(){
        if(top==-1){
            throw new RuntimeException("Stack is Empty...");
        }
        return stackArray[top];
    }
    public void resize(){
        T[] newStack=(T[])new Object[stackArray.length*2];
        for(int i=0;i<=top;i++){
            newStack[i]=stackArray[i];

        }
        stackArray=newStack;

    }
    public void display(){
        if(top==-1){
            throw new RuntimeException("Stack is Empty..");
        }
        System.out.println("Elements are...");
        for(int i=top;i>=0;i--){
            System.out.print(stackArray[i]+" ");
        }
        System.out.println();
    }



    public boolean isEmpty(){
        return top==-1;
    }
    public int size(){
        return top+1;
    }


}
public class GenericStack {
    public static void main(String[] args) {

        MyStack<Integer> intStack = new MyStack<>(2);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for push Operation ");
        int n=sc.nextInt();
        System.out.println("Now Enter the elements for push operations..");
        for(int i=0;i<n;i++){
            intStack.push(sc.nextInt());
        }
        intStack.display();
        System.out.println("POP element " +intStack.pop());
        intStack.display();
        //System.out.println(intStack.pop());
        System.out.println(intStack.peek());
        System.out.println(intStack.size());

        MyStack<String> strStack = new MyStack<>(2);
        strStack.push("Java");
        strStack.push("Generics");

        System.out.println(strStack.pop());  // Generics
    }
}
