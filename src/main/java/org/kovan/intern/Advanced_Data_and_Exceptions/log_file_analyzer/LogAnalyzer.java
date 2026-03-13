package org.kovan.intern.Advanced_Data_and_Exceptions.log_file_analyzer;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

public class LogAnalyzer {
    public static void main(String[] args) {
        Path path  = Paths.get("server.log");
        AtomicLong totalRequests= new AtomicLong();
        Map<String, Long> ipCount = new HashMap<>();
        Map<String, Long> urlCount = new HashMap<>();
        AtomicLong totalError404= new AtomicLong();
        try(Stream<String> lines = Files.lines(path)){
            lines.forEach(line->{
                String[] parts = line.split(" ");
                String ip = parts[0];
                String status = parts[1];
                String url = parts[2];
                totalRequests.getAndIncrement();
                ipCount.put(ip, ipCount.getOrDefault(ip, 0L) + 1);
                urlCount.put(url, urlCount.getOrDefault(url, 0L) + 1);
                if(status.equals("404")){
                    totalError404.getAndIncrement();
                }
            });
        } catch (RuntimeException | IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Total Requests "+totalRequests);
        System.out.println("404 Errors "+totalError404);
        System.out.println();
        System.out.println("Top 5 ips");
        ipCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(5).forEach(System.out::println);
        System.out.println();
        System.out.println("Top 3 Urls");
        urlCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).forEach(System.out::println);
    }
}