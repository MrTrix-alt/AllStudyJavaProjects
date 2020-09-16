package edu.java.project.studentorder.domain.entity;

import java.time.LocalDate;

public class Child extends Person
{
    private String numberOfBirthdayCertificate;
    private LocalDate issueDate;
    private String issueDepartment;

    public Child()
    {
    }

    public Child(String surname, String firstName, String patronymic, LocalDate dateOfBirthDay)
    {
        super(surname, firstName, patronymic, dateOfBirthDay);
    }

    public int re(int a)
    {
        return a;
    }

    public int re(int... a)
    {
        return a[0];
    }

    public String getNumberOfBirthdayCertificate()
    {
        return numberOfBirthdayCertificate;
    }

    public void setNumberOfBirthdayCertificate(String numberOfBirthdayCertificate)
    {
        this.numberOfBirthdayCertificate = numberOfBirthdayCertificate;
    }

    public LocalDate getIssueDate()
    {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate)
    {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment()
    {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment)
    {
        this.issueDepartment = issueDepartment;
    }
}
