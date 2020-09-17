package ru.learning.basepatterns.structural.bridge.enitity;

import ru.learning.basepatterns.structural.bridge.bridge.Language;

public class MobileApp extends BackEnd {

    public MobileApp(Language language) {
        super(language);
    }

    public void takeLanguage() {
        System.out.println("Language for MobileApp back-end: " + language.setLanguage());
    }
}
