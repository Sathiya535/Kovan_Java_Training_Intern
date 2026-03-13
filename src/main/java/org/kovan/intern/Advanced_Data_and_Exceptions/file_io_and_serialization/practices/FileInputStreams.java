package org.kovan.intern.Advanced_Data_and_Exceptions.file_io_and_serialization.practices;
import java.io.FileInputStream;  // Import FileInputStream
import java.io.IOException;      // Import IOException

public class FileInputStreams {
    public static void main(String[] args) {

        try (FileInputStream input = new FileInputStream("sathiya_priya_s.txt")) {
            int i;
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}

