package org.kovan.intern.Advanced_Data_and_Exceptions.file_io_and_serialization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

abstract class Characters implements Serializable {
    String name;
    int strength;
    int health;

    Characters(String name, int health, int strength){
        this.name=name;
        this.health=health;
        this.strength=strength;
    }

    public abstract void attack(Characters opponent);

    public  void takeDamage(int damage){
        health=health-damage;
        if(health<0){
            health=0;
        }
    }

    public boolean isAlive(){
        return health > 0;
    }

    public String getStatus(){
        return name+" Health: "+health;
    }
}

class Warrior extends Characters {

    Warrior(String name) {
        super(name, 2000, 15);
    }

    @Override
    public void attack(Characters opponent) {
        int damage = strength+(10);
        System.out.println(name + "attacks the "+opponent.name);
        opponent.takeDamage(damage);
    }
}

class Mage extends Characters {

    Mage(String name) {
        super(name, 80, 30);
    }

    @Override
    public void attack(Characters opponent) {
        int damage = strength+(20);
        System.out.println(name + "attacks the "+opponent.name);
        opponent.takeDamage(damage);
    }
}

class Arena{
    public static void fight(Characters character1, Characters character2) {
        System.out.println("The RPG Battle");
        System.out.println(character1.getStatus());
        System.out.println(character2.getStatus());
        System.out.println("Started");

        while (character1.isAlive() && character2.isAlive()){
            character1.attack(character2);
            System.out.println(character1.getStatus());
            System.out.println(character2.getStatus());
            if (!character2.isAlive()) {
                break;
            }
            character2.attack(character1);
            System.out.println(character1.getStatus());
            System.out.println(character2.getStatus());
        }

        System.out.println("The Winner is "+(character1.isAlive()?character1.name:character2.name));
    }
}

class GameStorage{
    private static final Path path = Paths.get("player.dat");
    public static void save(Characters characters){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))){
            objectOutputStream.writeObject(characters);
            objectOutputStream.close();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static  Characters load(){
        if(Files.notExists(path)){
            System.out.println("File Not Found");
            return null;
        }
        try(ObjectInputStream fileInputStream = new ObjectInputStream(Files.newInputStream(path))){
            System.out.println("Loaded The Game");
            return (Characters) fileInputStream.readObject();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
public class SerialRPGBattleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("RPG Battle with Load and Save");
            System.out.println("1. New Game");
            System.out.println("2. Load Game");
            System.out.println("3. New Exit");
            System.out.println("Kindly Choose......");
            int option = scanner.nextInt();
            try{switch (option){
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter the Player name");
                    String name = scanner.nextLine();
                    Characters characters1= new Warrior(name);
                    Characters characters2= new Mage("Enemy");
                    Arena.fight(characters1,characters2);
                    GameStorage.save(characters1);
                    break;
                case 2:
                    System.out.println("Loaded the Game");
                    Characters characters3 = GameStorage.load();
                    if(characters3!=null){
                        System.out.println(characters3.getStatus());
                        Characters characters4= new Mage("Enemy");
                        Arena.fight(characters3,characters4);
                        GameStorage.save(characters3);
                    }
                    break;
                case 3:
                    System.out.println("Exiting Game....");
                    return;
                default:
                    System.out.println("Invalid");
                    break;
            }
            } catch (Exception e) {
                System.out.println("Wrong...");
            }
        }
    }
}