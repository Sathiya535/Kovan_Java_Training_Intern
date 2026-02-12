package org.kovan.intern.Advanced_Data_and_Exceptions.exception_handling_pattern.daily_task;

import java.io.*;

// Step 1: Custom Runtime Exception
class DataProcessingException extends RuntimeException {

    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Step 2: Service class
class FileService {

    public void processFile() {

        try {
            // Trying to open a file that may not exist
            FileReader fr = new FileReader("data.txt");
            System.out.println("Processing file...");

        } catch (IOException e) {

            // Catching checked exception
            System.out.println("IOException caught inside FileService");

            // Rethrowing as custom unchecked exception
            throw new DataProcessingException(
                    "Error while processing data file",
                    e
            );
        }
    }
}

// Step 3: Main class
public class RethrowDemo {

    public static void main(String[] args) {

        FileService service = new FileService();

        try {
            service.processFile();
        } catch (DataProcessingException e) {

            System.out.println("Custom Exception Caught in Main");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Original Cause: " + e.getCause());
        }

        System.out.println("Program continues...");
    }
}
