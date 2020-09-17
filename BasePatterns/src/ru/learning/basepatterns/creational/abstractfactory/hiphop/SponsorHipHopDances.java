package ru.learning.basepatterns.creational.abstractfactory.hiphop;

import ru.learning.basepatterns.creational.abstractfactory.entities.Sponsor;

public class SponsorHipHopDances implements Sponsor {
    @Override
    public void sponsoringProject() {
        System.out.println("Found sponsor will give money for the hip-hop team");
    }
}
