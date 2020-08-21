package mrtrix.learning.java.io.prints;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) {
        File file = new File("data\\result.txt");
        double[] values = {1.10, 1.2, 1.401, 5.01, 6.017, 7, 8, 9};
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                PrintStream stream = new PrintStream(fileOutputStream);
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);
                PrintWriter printWriter1 = new PrintWriter(stream)
        ) {

            for (double val : values) {
                stream.printf("Java %.2g%n", val);
                // 22ая строка указывает на поток,
                // который будет выводить данные
                System.setOut(stream);
                // в консоль выводиться ничего не будет
                // произойдет только запись в файл
                System.out.printf("%.2g%n", val);
                printWriter1.printf("\nJava %.2g%n", val);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
