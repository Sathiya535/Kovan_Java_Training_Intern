package org.kovan.intern.Advanced_Data_and_Exceptions.file_io_and_serialization.practices;

import java.io.File;
import java.io.IOException;

public class CreateAndDeleteFile {
    public static void main(String[] args) {

        try {
            // Create file
            File myObj = new File("sample.txt");

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Delete file
            if (myObj.delete()) {
                System.out.println("File deleted: " + myObj.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
