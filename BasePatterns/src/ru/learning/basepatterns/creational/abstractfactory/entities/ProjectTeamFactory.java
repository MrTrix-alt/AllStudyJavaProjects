package ru.learning.basepatterns.creational.abstractfactory.entities;

public interface ProjectTeamFactory {
    Dancer getDancer();
    Choreographer getChoreographer();
    Sponsor findSponsor();
}
