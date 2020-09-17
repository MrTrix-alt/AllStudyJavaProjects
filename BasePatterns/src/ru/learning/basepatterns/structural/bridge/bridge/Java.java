package ru.learning.basepatterns.structural.bridge.bridge;

public class Java implements Language {
    @Override
    public LanguageEnum setLanguage() {
        return LanguageEnum.Java;
    }
}
