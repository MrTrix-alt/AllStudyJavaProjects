package ru.learning.basepatterns.structural.bridge.enitity;

import ru.learning.basepatterns.structural.bridge.bridge.Language;

public abstract class BackEnd {
    Language language;

    public BackEnd(Language language) {
        this.language = language;
    }

    public abstract void takeLanguage();
}
