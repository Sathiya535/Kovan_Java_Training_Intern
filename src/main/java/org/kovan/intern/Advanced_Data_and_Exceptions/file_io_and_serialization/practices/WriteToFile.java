package org.kovan.intern.Advanced_Data_and_Exceptions.file_io_and_serialization.practices;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("sathiya_priya_s.txt");
            myWriter.write("Today I learn about the File Handling....");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}