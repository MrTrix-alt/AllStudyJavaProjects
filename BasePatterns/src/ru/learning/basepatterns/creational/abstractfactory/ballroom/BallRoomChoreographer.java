package ru.learning.basepatterns.creational.abstractfactory.ballroom;

import ru.learning.basepatterns.creational.abstractfactory.entities.Choreographer;

public class BallRoomChoreographer implements Choreographer {

    @Override
    public void teachTeam() {
        System.out.println("Ballroom Choreographer teaches team for ballroom competition");
    }
}
