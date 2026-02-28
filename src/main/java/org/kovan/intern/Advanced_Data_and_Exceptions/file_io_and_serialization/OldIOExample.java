package org.kovan.intern.Advanced_Data_and_Exceptions.file_io_and_serialization;

import java.io.*;

public class OldIOExample {
    public static void main(String[] args) {
        try {
            // Create file
            File file = new File("old.txt");
            file.createNewFile();

            // Write to file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello from Old IO");
            writer.close();

            // Read from file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Copy file
            FileInputStream in = new FileInputStream(file);
            FileOutputStream out = new FileOutputStream("oldCopy.txt");

            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }

            in.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
