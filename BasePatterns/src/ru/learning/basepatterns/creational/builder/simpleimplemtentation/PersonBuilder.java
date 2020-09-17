package ru.learning.basepatterns.creational.builder.simpleimplemtentation;

public class PersonBuilder {
    private String name = "Name";
    private Specialty specialty = Specialty.Intern;
    private int salary = 15000;


    PersonBuilder buildName(String name) {
        this.name = name;
        return this; // возвращаем CarBuilder, чтобы поочередно вызывать методы для строительства
    }

    PersonBuilder buildSpecialty(Specialty specialty) {
        this.specialty = specialty;
        return this;
    }
    PersonBuilder buildSalary(int salary) {
        this.salary = salary;
        return this;
    }

    Person build() {
        Person person = new Person();
        person.setName(name);
        person.setSpecialty(specialty);
        person.setSalary(salary);
        return person;
    }
}
