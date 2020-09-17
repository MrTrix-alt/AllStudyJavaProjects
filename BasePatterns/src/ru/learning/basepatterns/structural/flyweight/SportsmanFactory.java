package ru.learning.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SportsmanFactory {
    private static final Map<String, Sportsman> sportsmen = new HashMap<>();

    public Sportsman getSportsmanBySpecialty(String specialty) {
        Sportsman sportsman = sportsmen.get(specialty);

        if(sportsman == null ) {
            switch(specialty) {
                case "basketball":
                    System.out.println("Hiring Basketball player");
                    sportsman = new BasketballPlayer();
                    break;
                case "volleyball":
                    System.out.println("Hiring Volleyball player");
                    sportsman = new VolleyballPlayer();
                    break;
            }
            sportsmen.put(specialty, sportsman);
        }
        return sportsman;
    }
}
