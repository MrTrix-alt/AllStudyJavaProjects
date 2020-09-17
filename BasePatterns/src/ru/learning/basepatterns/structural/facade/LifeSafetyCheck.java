package ru.learning.basepatterns.structural.facade;

public class LifeSafetyCheck {
    private boolean checkLifeSafety;

    public boolean isSafely() {
        return checkLifeSafety;
    }

    public void startBuilding() {
        System.out.println("Safety conditions checked. Building can continue.");
        checkLifeSafety = true;
    }

    public void stopBuilding() {
        System.out.println("Construction must be stopped.");
        checkLifeSafety = false;
    }
}
