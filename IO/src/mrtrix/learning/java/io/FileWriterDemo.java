package mrtrix.learning.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("data/input.txt");
             FileWriter fileWriter = new FileWriter("data/output.txt")) {
            char[] buffer = new char[32];
            fileReader.read(buffer);
            for (char ch : buffer) {
                System.out.print(ch);
            }
            fileWriter.write(buffer,0, buffer.length);
            fileWriter.write("\nI'm learning Java IO");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

