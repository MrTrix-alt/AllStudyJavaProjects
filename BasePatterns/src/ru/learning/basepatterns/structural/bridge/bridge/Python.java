package ru.learning.basepatterns.structural.bridge.bridge;

public class Python implements Language {

    @Override
    public LanguageEnum setLanguage() {
        return LanguageEnum.Python;
    }
}
