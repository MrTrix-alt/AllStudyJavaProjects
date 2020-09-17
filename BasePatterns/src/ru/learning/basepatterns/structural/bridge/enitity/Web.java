package ru.learning.basepatterns.structural.bridge.enitity;

import ru.learning.basepatterns.structural.bridge.bridge.Language;

public class Web extends BackEnd {

    public Web(Language language) {
        super(language);
    }

    public void takeLanguage() {
        System.out.println("Language for Web back-end: " + language.setLanguage());
    }
}
