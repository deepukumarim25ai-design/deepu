package com.edu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class day13 {
    static void main() {
        Path path = Path.of("src/files", "report.txt");
        try {
            List<String>data = Files.readAllLines(path);
            for(String line : data){
                System.out.println(line);
            }
        }catch (IOException io){
            io.printStackTrace();
            System.out.println("Error reading file");
        }
    }
}