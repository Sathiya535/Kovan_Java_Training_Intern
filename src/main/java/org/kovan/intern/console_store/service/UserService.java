package org.kovan.intern.console_store.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserService {

    public boolean login(String username, String password) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("users.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data[0].equals(username) && data[1].equals(password)) {
                    br.close();
                    return true;
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading user file");
        }

        return false;
    }
}