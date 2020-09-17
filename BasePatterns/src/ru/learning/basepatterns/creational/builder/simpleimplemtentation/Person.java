package ru.learning.basepatterns.creational.builder.simpleimplemtentation;

public class Person {
    private String name;
    private Specialty specialty;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer [name: " + name + ", specialty: " + specialty
                + ", salary: " + salary + "]";
    }
}
