package ru.learning.basepatterns.creational.abstractfactory.project;


import ru.learning.basepatterns.creational.abstractfactory.entities.Choreographer;
import ru.learning.basepatterns.creational.abstractfactory.entities.Dancer;
import ru.learning.basepatterns.creational.abstractfactory.entities.ProjectTeamFactory;
import ru.learning.basepatterns.creational.abstractfactory.entities.Sponsor;
import ru.learning.basepatterns.creational.abstractfactory.hiphop.HipHopTeamFactory;

public class HipHopShow {
    public static void main(String[] args) {
        ProjectTeamFactory hipHopTeam = new HipHopTeamFactory();
        Dancer dancer = hipHopTeam.getDancer();
        Choreographer choreographer = hipHopTeam.getChoreographer();
        Sponsor sponsor = hipHopTeam.findSponsor();

        System.out.println("Preparing for Hip-Hop Competition: ");
        dancer.dance();
        choreographer.teachTeam();
        sponsor.sponsoringProject();
    }

}
