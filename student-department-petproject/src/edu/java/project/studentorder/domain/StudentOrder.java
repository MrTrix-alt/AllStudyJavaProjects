package edu.java.project.studentorder.domain;

import edu.java.project.studentorder.domain.entity.AdultMan;
import edu.java.project.studentorder.domain.entity.Child;
import edu.java.project.studentorder.domain.office.RegisterOffice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StudentOrder
{
    private long studentOrderId;
    private StudentOrderStatus studentOrderStatus;
    private LocalDateTime studentOrderDate;
    private AdultMan husband;
    private AdultMan wife;
    private Child child;
    private List<Child> children;
    private String marriageCertificateId;
    private String marriageOffice;
    private LocalDate marriageDate;

    public void setStudentOrderStatus(StudentOrderStatus studentOrderStatus)
    {
        this.studentOrderStatus = studentOrderStatus;
    }

    public LocalDateTime getStudentOrderDate()
    {
        return studentOrderDate;
    }

    public void setStudentOrderDate(LocalDateTime studentOrderDate)
    {
        this.studentOrderDate = studentOrderDate;
    }

    public long getStudentOrderId()
    {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId)
    {
        this.studentOrderId = studentOrderId;
    }

    public AdultMan getHusband()
    {
        return husband;
    }

    public void setHusband(AdultMan husband)
    {
        this.husband = husband;
    }

    public AdultMan  getWife()
    {
        return wife;
    }

    public void setWife(AdultMan wife)
    {
        this.wife = wife;
    }

    public Child getChild()
    {
        return child;
    }

    public void setChild(Child child)
    {
        this.child = child;
    }

    public void addChild(Child child)
    {
        if (children == null) {
            children = new ArrayList<>(5);
        }
        children.add(child);
    }

    public List<Child> getChildren()
    {
        return children;
    }

    public String getMarriageCertificateId()
    {
        return marriageCertificateId;
    }

    public void setMarriageCertificateId(String marriageCertificateId)
    {
        this.marriageCertificateId = marriageCertificateId;
    }

    public String getMarriageOffice()
    {
        return marriageOffice;
    }

    public void setMarriageOffice(String marriageOffice)
    {
        this.marriageOffice = marriageOffice;
    }

    public LocalDate getMarriageDate()
    {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate)
    {
        this.marriageDate = marriageDate;
    }

    @Override
    public String toString()
    {
        return "StudentOrder {" +
                "studentOrderId=" + studentOrderId +
                ", studentOrderStatus=" + studentOrderStatus +
                ", studentOrderDate=" + studentOrderDate +
                ", husband=" + husband +
                ", wife=" + wife +
                ", children=" + children +
                ", marriageCertificateId='" + marriageCertificateId + '\'' +
                ", marriageOffice=" + marriageOffice +
                ", marriageDate=" + marriageDate +
                '}';
    }


}
