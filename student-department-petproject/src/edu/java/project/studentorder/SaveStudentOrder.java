package edu.java.project.studentorder;

import edu.java.project.studentorder.domain.StudentOrder;
import edu.java.project.studentorder.domain.address.Address;
import edu.java.project.studentorder.domain.entity.AdultMan;
import edu.java.project.studentorder.domain.entity.Child;

import java.time.LocalDate;

public class SaveStudentOrder
{

    public static void main(String[] args)
    {

    }

    static StudentOrder buildStudentOrder(long id)
    {
        StudentOrder studentOrder = new StudentOrder();
        studentOrder.setStudentOrderId(id);
        studentOrder.setMarriageCertificateId("" +  (12365613 + id));
        studentOrder.setMarriageDate(LocalDate.of(2015, 7, 4));
        studentOrder.setMarriageOffice("Отдел ЗАГС");

        Address address = new Address(
                "321321", "ул. Ленина", "12Б",
                "", "142");

        // Husband
        AdultMan husband = new AdultMan(
                "Иванов", "Иван", "Иванович",
                         LocalDate.of(1994, 2, 22));

        husband.setPassportSeries("" + (1000 + id));
        husband.setPassportNumber("" + (100000 + id));
        husband.setIssueDate(LocalDate.of(2014, 3, 3));
        husband.setIssueDepartment("Отдел МВД №" + id);
        husband.setStudentCard("" + (100000 + id));
        husband.setAddress(address);

        // Wife
        AdultMan wife = new AdultMan(
                "Иванова", "Мария", "Петровна",
                         LocalDate.of(1995, 5, 12));

        wife.setPassportSeries("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssueDate(LocalDate.of(2015, 5, 27));
        wife.setIssueDepartment("Отдел МВД №" + id);
        wife.setStudentCard("" + (200000 + id));
        wife.setAddress(address);

        // Child
        Child child = new Child(
                "Иванов", "Алексей", "Иванович",
                         LocalDate.of(2019, 6, 23));

        child.setNumberOfBirthdayCertificate("" + (300000 + id));
        child.setIssueDate(LocalDate.of(2019, 7, 15));
        child.setIssueDepartment("Отдел ЗАГС №" + id);
        child.setAddress(address);

        // Передача информации о семье в заявку
        studentOrder.setHusband(husband);
        studentOrder.setWife(wife);
        studentOrder.setChild(child);

        return studentOrder;

    }


}
