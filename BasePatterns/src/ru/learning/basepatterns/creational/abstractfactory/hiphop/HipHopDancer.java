package ru.learning.basepatterns.creational.abstractfactory.hiphop;

import ru.learning.basepatterns.creational.abstractfactory.entities.Dancer;

public class HipHopDancer implements Dancer {
    @Override
    public void dance() {
        System.out.println("Hip-hop Dancer will dance on hip-hop competition");
    }
}
