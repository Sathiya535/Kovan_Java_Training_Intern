package org.kovan.intern.Advanced_Data_and_Exceptions.file_io_and_serialization;

import java.io.File;

public class DirectoryWalker {

    public static void main(String[] args) {


        String folderPath = "C:\\Users\\Sathiya Priya S\\Documents";
       // String fp="search-ms:displayname=Search%20Results%20in%20Home&crumb=location:%3A%3A{F874310E-B6B7-47DC-BC84-B9E6B38F5903}\\Java_Training_Kovan";
        File folder = new File(folderPath);
        //File folder = new File(fp);

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
