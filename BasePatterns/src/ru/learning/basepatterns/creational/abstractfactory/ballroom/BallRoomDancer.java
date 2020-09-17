package ru.learning.basepatterns.creational.abstractfactory.ballroom;

import ru.learning.basepatterns.creational.abstractfactory.entities.Dancer;

public class BallRoomDancer implements Dancer {
    @Override
    public void dance() {
        System.out.println("Ballroom Dancer will dance on ballroom competition");
    }
}
