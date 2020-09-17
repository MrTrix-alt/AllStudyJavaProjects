package ru.learning.basepatterns.behavioral.memento;

import java.util.Date;

public class SaverStateOfObject {
    private final String version;
    private final Date date;

    public SaverStateOfObject(String version) {
        this.version = version;
        date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}
