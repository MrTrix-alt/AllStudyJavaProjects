package ru.learning.basepatterns.creational.builder.simpleimplemtentation;

public class Main {
    public static void main(String[] args) {
        Person developer = new PersonBuilder()
                                .buildName("Max")
                                .buildSpecialty(Specialty.Developer)
                                .buildSalary(30000)
                                .build();

        System.out.println(developer);

        Person person = new PersonBuilder()
                      .build(); // default developer

        System.out.println(person);
    }
}
