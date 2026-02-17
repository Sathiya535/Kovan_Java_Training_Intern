package org.kovan.intern.Advanced_Data_and_Exceptions.file_io_and_serialization;

import java.io.File;

public class DirectoryWalker {

    public static void main(String[] args) {


        String folderPath = "C:\\Users\\Sathiya Priya S\\Documents";

        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            listFiles(folder);
        } else {
            System.out.println("Invalid folder path.");
        }
    }

    public static void listFiles(File file) {


        if (file.isFile()) {
            System.out.println("File: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("-----------------------------------");
        }


        else if (file.isDirectory()) {
            File[] files = file.listFiles();

            if (files != null) {
                for (File f : files) {
                    listFiles(f);
                }
            }
        }
    }
}
