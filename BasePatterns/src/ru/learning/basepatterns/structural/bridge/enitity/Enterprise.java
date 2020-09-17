package ru.learning.basepatterns.structural.bridge.enitity;

import ru.learning.basepatterns.structural.bridge.bridge.Language;

public class Enterprise extends BackEnd {
    public Enterprise(Language language) {
        super(language);
    }

    public void takeLanguage() {
        System.out.println("Language for Enterprise back-end: " + language.setLanguage());
    }
}
