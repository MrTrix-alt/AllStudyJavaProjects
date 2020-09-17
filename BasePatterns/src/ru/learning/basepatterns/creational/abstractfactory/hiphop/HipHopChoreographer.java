package ru.learning.basepatterns.creational.abstractfactory.hiphop;

import ru.learning.basepatterns.creational.abstractfactory.entities.Choreographer;

public class HipHopChoreographer implements Choreographer {

    @Override
    public void teachTeam() {
        System.out.println("Hip-Hop Choreographer teaches team for hip-hop competition");
    }
}
