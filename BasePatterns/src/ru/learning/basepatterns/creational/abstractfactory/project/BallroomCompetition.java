package ru.learning.basepatterns.creational.abstractfactory.project;

import ru.learning.basepatterns.creational.abstractfactory.ballroom.BallRoomTeamFactory;
import ru.learning.basepatterns.creational.abstractfactory.entities.Choreographer;
import ru.learning.basepatterns.creational.abstractfactory.entities.Dancer;
import ru.learning.basepatterns.creational.abstractfactory.entities.ProjectTeamFactory;
import ru.learning.basepatterns.creational.abstractfactory.entities.Sponsor;


public class BallroomCompetition {
    public static void main(String[] args) {
        ProjectTeamFactory ballRoomTeam = new BallRoomTeamFactory();
        Dancer dancer = ballRoomTeam.getDancer();
        Choreographer choreographer = ballRoomTeam.getChoreographer();
        Sponsor sponsor = ballRoomTeam.findSponsor();

        System.out.println("Preparing for Ballroom Competition: ");
        dancer.dance();
        choreographer.teachTeam();
        sponsor.sponsoringProject();
    }
}
