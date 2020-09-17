package ru.learning.basepatterns.structural.facade;

public class Builder {

     public void doJob(LifeSafetyCheck lifeSafetyCheck) {
         if (lifeSafetyCheck.isSafely()) {
             System.out.println("The builder can go back to work.");
         } else {
             System.out.println("The builder is waiting for the end of the check...");
         }
     }
}
