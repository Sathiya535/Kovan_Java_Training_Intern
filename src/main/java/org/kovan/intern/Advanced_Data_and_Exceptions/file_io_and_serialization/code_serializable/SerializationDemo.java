package org.kovan.intern.Advanced_Data_and_Exceptions.file_io_and_serialization.code_serializable;

import org.kovan.intern.Advanced_Data_and_Exceptions.file_io_and_serialization.practices.FileInputStreams;

import java.io.*;

class Person implements Serializable{
    int i;
}
public class SerializationDemo {
    public static void main(String[] args) throws Exception{
        Person obj1=new Person();
        obj1.i=10;
        System.out.println(obj1.i);

        File f=new File("sample.ser");
        System.out.println(f.getAbsolutePath());
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj1);


        //Deserialization

        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Person obj=(Person)ois.readObject();
        System.out.println("Value Of Object2 = "+obj.i);

    }
}
