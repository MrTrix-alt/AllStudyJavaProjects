package ru.learning.basepatterns.structural.bridge.bridge;

public class Kotlin implements Language {

    @Override
    public LanguageEnum setLanguage() {
        return LanguageEnum.Kotlin;
    }
}
