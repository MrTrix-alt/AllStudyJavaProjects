package mrtrix.learning.java.io.serialization;

import java.io.*;

public class DeSerialization {
    public static void main(String[] args) {
        try
        (
             FileInputStream fileInputStream =  new FileInputStream("data/ObjectOutput.dat");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

