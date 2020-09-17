package ru.learning.basepatterns.creational.abstractfactory.hiphop;


import ru.learning.basepatterns.creational.abstractfactory.entities.Choreographer;
import ru.learning.basepatterns.creational.abstractfactory.entities.Dancer;
import ru.learning.basepatterns.creational.abstractfactory.entities.ProjectTeamFactory;
import ru.learning.basepatterns.creational.abstractfactory.entities.Sponsor;

public class HipHopTeamFactory implements ProjectTeamFactory {
    @Override
    public Dancer getDancer() {
        return new HipHopDancer();
    }

    @Override
    public Choreographer getChoreographer() {
        return new HipHopChoreographer();
    }

    @Override
    public Sponsor findSponsor() {
        return new SponsorHipHopDances();
    }
}
