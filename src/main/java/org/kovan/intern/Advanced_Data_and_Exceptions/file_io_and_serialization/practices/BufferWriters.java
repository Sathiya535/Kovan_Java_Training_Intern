package org.kovan.intern.Advanced_Data_and_Exceptions.file_io_and_serialization.practices;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferWriters {
    public static void main (String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("sathiya_priya_s.txt"))) {
            bw.write("First line");
            bw.newLine();
            bw.write("Second line");
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e)
        {
            System.out.println("Error writing file.");
        }
    }
}
