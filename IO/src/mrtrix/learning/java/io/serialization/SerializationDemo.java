package mrtrix.learning.java.io.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        try (FileOutputStream fileOutput = new FileOutputStream("data/ObjectOutput.dat");
             ObjectOutputStream output = new ObjectOutputStream(fileOutput)
        ) {
            Student student = new Student(1321L, "Tim", "czceqqa");
            output.writeObject(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
