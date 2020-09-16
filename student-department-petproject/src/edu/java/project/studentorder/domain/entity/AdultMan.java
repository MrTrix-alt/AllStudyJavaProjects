package edu.java.project.studentorder.domain.entity;

import java.time.LocalDate;

public class AdultMan extends Person
{
    private String passportSeries;
    private String passportNumber;
    private LocalDate issueDate;
    private String issueDepartment;
    private String nameOfUniversity;
    private String studentCard;

    public AdultMan() {
    }

    public AdultMan(String surname, String firstName, String patronymic, LocalDate dateOfBirthDay) {
        super(surname, firstName, patronymic, dateOfBirthDay);
    }

    @Override
    public String getPersonInfo()
    {
        return super.getPersonInfo() + ": " + passportNumber;
    }

    public String getPassportSeries()
    {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries)
    {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber()
    {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber)
    {
        this.passportNumber = passportNumber;
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

    public String getNameOfUniversity()
    {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity)
    {
        this.nameOfUniversity = nameOfUniversity;
    }

    public String getStudentCard()
    {
        return studentCard;
    }

    public void setStudentCard(String studentCard)
    {
        this.studentCard = studentCard;
    }
}
