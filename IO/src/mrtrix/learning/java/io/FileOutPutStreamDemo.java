package mrtrix.learning.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamDemo {
    public static void main(String[] args) {
        try (FileOutputStream d = new FileOutputStream("data/output.txt", true)) {
            d.write(48);
            byte[] w = {65, 67, 100, 122, 43, 11};
            d.write(w);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
