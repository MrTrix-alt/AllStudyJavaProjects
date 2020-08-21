package mrtrix.learning.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileInPutStreamDemo {
    public static void main(String[] args) {

        try (FileInputStream input = new FileInputStream("data/input.txt");
             FileOutputStream out = new FileOutputStream("data/output.txt", true)
        ) {

            byte[] reading = new byte[32];
            input.read(reading);
            for (int i = 0; i < reading.length ; i++) {
                System.out.print((char) reading[i]);
            }
            out.write(reading);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
