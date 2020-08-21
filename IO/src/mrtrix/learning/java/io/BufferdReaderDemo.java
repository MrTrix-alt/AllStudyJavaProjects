package mrtrix.learning.java.io;

import java.io.*;
import java.util.ArrayList;

public class BufferdReaderDemo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("data/input.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            ArrayList<String> strings = new ArrayList<>();
            bufferedReader.lines().forEach(strings::add);
            System.out.println(strings);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

