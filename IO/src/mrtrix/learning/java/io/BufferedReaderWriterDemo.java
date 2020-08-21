package mrtrix.learning.java.io;

import java.io.*;

public class BufferedReaderWriterDemo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("data/input.txt");
             FileWriter fileWriter = new FileWriter("data/output.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            // String line = bufferedReader.readLine(); // построчное чтение
            // bufferedWriter.write(line, 0, line.length()); // запись строки в файл
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                bufferedWriter.write(text, 0, text.length());
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
