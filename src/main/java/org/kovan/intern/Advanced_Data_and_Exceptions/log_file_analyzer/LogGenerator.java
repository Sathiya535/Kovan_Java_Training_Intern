package org.kovan.intern.Advanced_Data_and_Exceptions.log_file_analyzer;




import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.stream.Stream;

public class LogGenerator {
    static String[] url ={
            "/home", "/login", "/products", "/about", "/contact", "/cart"
    };
    static  int[] statusCodes = {
            200, 200, 200, 404, 500
    };

    public static void generateLog(Path path, int lines){
        Random random = new Random();
        Stream<String> stringStream = Stream.generate(()->{
            String ip = random.nextInt(256) + "." +random.nextInt(256) + "." +random.nextInt(256) + "." + random.nextInt(256);
            String timestamp = LocalDateTime.now()
                    .minusSeconds(random.nextInt(100000))
                    .toString();
            int status = statusCodes[random.nextInt(statusCodes.length)];
            String urls = url[random.nextInt(url.length)];
            return ip + " " + timestamp + " " + status + " " + urls;
        }).limit(lines);
        try{
            Files.write(path,stringStream.toList());
            System.out.println("Generated...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Path filePath = Paths.get("server.log");
        int totalLines = 10_000;
        generateLog(filePath,totalLines);
    }
}
