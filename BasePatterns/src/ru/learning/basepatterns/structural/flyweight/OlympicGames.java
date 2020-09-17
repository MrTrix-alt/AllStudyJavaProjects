package ru.learning.basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class OlympicGames { // Клиентский код
    public static void main(String[] args) {
        SportsmanFactory sportsmanFactory = new SportsmanFactory();

        List<Sportsman> sportsmen = new ArrayList<>();

        sportsmen.add(sportsmanFactory.getSportsmanBySpecialty("basketball"));
        sportsmen.add(sportsmanFactory.getSportsmanBySpecialty("basketball"));
        sportsmen.add(sportsmanFactory.getSportsmanBySpecialty("basketball"));
        sportsmen.add(sportsmanFactory.getSportsmanBySpecialty("basketball"));
        sportsmen.add(sportsmanFactory.getSportsmanBySpecialty("basketball"));
        sportsmen.add(sportsmanFactory.getSportsmanBySpecialty("basketball"));

        sportsmen.add(sportsmanFactory.getSportsmanBySpecialty("volleyball"));
        sportsmen.add(sportsmanFactory.getSportsmanBySpecialty("volleyball"));
        sportsmen.add(sportsmanFactory.getSportsmanBySpecialty("volleyball"));
        sportsmen.add(sportsmanFactory.getSportsmanBySpecialty("volleyball"));
        sportsmen.add(sportsmanFactory.getSportsmanBySpecialty("volleyball"));


        for (Sportsman sportsman : sportsmen) {
            sportsman.trainee();
        }
    }
}
