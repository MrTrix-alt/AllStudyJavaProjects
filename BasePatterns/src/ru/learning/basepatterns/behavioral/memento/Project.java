package ru.learning.basepatterns.behavioral.memento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public SaverStateOfObject save() {
        return new SaverStateOfObject(version);
    }

    public void load(SaverStateOfObject save) {
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project:\n" +
                "\nVersion: " + version +
                "\nDate: " + date + "\n";
    }
}
