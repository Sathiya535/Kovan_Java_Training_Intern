package org.kovan.intern.oops_and_architectural_thinking.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static List<String> readFile(String fileName) {

        List<String> lines = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        return lines;
    }

}