package mrtrix.learning.java.io.serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private String faculty = "Chemical Technology";
    private Long id;
    private String name;
    private transient String password;
    private static final long serialVersionUID = 1L;

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "\nfaculty " + faculty + "\nname " + name  + "\nID "
                + id + "\npassword " + password;
    }
}
