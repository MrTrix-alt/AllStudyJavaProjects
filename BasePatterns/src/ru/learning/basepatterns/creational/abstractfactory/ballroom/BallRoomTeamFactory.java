package ru.learning.basepatterns.creational.abstractfactory.ballroom;

import ru.learning.basepatterns.creational.abstractfactory.entities.Choreographer;
import ru.learning.basepatterns.creational.abstractfactory.entities.Dancer;
import ru.learning.basepatterns.creational.abstractfactory.entities.ProjectTeamFactory;
import ru.learning.basepatterns.creational.abstractfactory.entities.Sponsor;

public class BallRoomTeamFactory implements ProjectTeamFactory {
    @Override
    public Dancer getDancer() {
        return new BallRoomDancer();
    }

    @Override
    public Choreographer getChoreographer() {
        return new BallRoomChoreographer();
    }

    @Override
    public Sponsor findSponsor() {
        return new SponsorBallRoomDances();
    }
}
