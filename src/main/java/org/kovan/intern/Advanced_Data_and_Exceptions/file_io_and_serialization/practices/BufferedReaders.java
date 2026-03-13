package org.kovan.intern.Advanced_Data_and_Exceptions.file_io_and_serialization.practices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaders {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("sathiya_priya_s.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
