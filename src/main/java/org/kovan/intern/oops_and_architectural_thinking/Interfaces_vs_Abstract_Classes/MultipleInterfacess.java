package org.kovan.intern.oops_and_architectural_thinking.Interfaces_vs_Abstract_Classes;

import org.w3c.dom.ls.LSOutput;

interface Camera{
    void start();

}
interface MusicPlayer{
    void start();
}
interface Phone{
    void makeCall();
}

class SmartPhone implements Camera,MusicPlayer,Phone {
    public void start() {

        System.out.println("Camara / Music started ");
    }
//    public void playMusic(){
//        System.out.println("Playing the music");
//    }
    public void makeCall(){
        System.out.println("Dialing.....");
    }

}
public class MultipleInterfacess {
    public static void main(String[] args){
        SmartPhone sm=new SmartPhone();
        sm.start();
        //sm.playMusic();
        sm.makeCall();
    }
}
