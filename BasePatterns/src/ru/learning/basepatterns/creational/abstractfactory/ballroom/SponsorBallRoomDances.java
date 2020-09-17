package ru.learning.basepatterns.creational.abstractfactory.ballroom;

import ru.learning.basepatterns.creational.abstractfactory.entities.Sponsor;

public class SponsorBallRoomDances implements Sponsor {
    @Override
    public void sponsoringProject() {
        System.out.println("Found sponsor will give money for the ballroom team");
    }
}
