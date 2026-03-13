package org.kovan.intern.Advanced_Data_and_Exceptions.file_io_and_serialization;
import java.nio.file.*;
import java.io.IOException;
//we use only path and files

public class NIOExample {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("new.txt");

        // Create file
        Files.createFile(path);

        // Write to file
        Files.writeString(path, "Hello from NIO");

        // Read from file
        String content = Files.readString(path);
        System.out.println(content);

        // Copy file
        Files.copy(path, Paths.get("newCopy.txt"),
                StandardCopyOption.REPLACE_EXISTING);
    }
}
