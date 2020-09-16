package edu.java.project.studentorder.domain.entity;

import edu.java.project.studentorder.domain.address.Address;

import java.time.LocalDate;

public abstract class Person
{
    private String surname; // фамилия
    private String firstName; // имя
    private String patronymic; // отчество
    private LocalDate dateOfBirthDay; // дата рождения
    private Address address; // адрес

    public Person() {
    }

    public Person(String surname, String firstName, String patronymic, LocalDate dateOfBirthDay) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public String getPersonInfo()
    {
        return getSurname() + " " + getFirstName();
    }


    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getPatronymic()
    {
        return patronymic;
    }

    public void setPatronymic(String patronymic)
    {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirthDay()
    {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(LocalDate dateOfBirthDay)
    {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }
}
