package mrtrix.learning.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("data/input.txt")) {
            char[] buffer = new char[32];
            fileReader.read(buffer);
            for (char ch : buffer) {
                System.out.print(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
