package edu.java.project.studentorder;

import edu.java.project.studentorder.domain.*;
import edu.java.project.studentorder.domain.answer.AnswerChildren;
import edu.java.project.studentorder.domain.answer.AnswerCityRegister;
import edu.java.project.studentorder.domain.answer.AnswerStudent;
import edu.java.project.studentorder.domain.answer.AnswerWedding;
import edu.java.project.studentorder.mail.MailSender;
import edu.java.project.studentorder.validator.ChildrenValidator;
import edu.java.project.studentorder.validator.CityRegisterValidator;
import edu.java.project.studentorder.validator.StudentValidator;
import edu.java.project.studentorder.validator.WeddingValidator;

public class StudentOrderValidator
{

    private CityRegisterValidator cityRegisterValidator;
    private WeddingValidator weddingValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private MailSender mailSender;

    public StudentOrderValidator()
    {
        cityRegisterValidator = new CityRegisterValidator();
        weddingValidator = new WeddingValidator();
        childrenValidator = new ChildrenValidator();
        studentValidator = new StudentValidator();
        mailSender = new MailSender();
    }
    public static void main(String[] args)
    {
        StudentOrderValidator studentOrderValidator = new StudentOrderValidator();
        studentOrderValidator.checkAll();
    }

    public void checkAll()
    {
        StudentOrder[] studentOrders = readStudentOrders();

//        for (int i = 0; i < studentOrders.length ; i++)
//        {
//            System.out.println();
//            checkOneOrder(studentOrders[i]);
//        }
        
        for(StudentOrder so : studentOrders)
        {
            System.out.println("\nStudentOrderId: " + so.getStudentOrderId());
            checkOneOrder(so);
        }

    }

    // чтение студенческий заявок
    public StudentOrder[] readStudentOrders()
    {
        StudentOrder[] studentOrders = new StudentOrder[3];

        for(int i = 0; i < studentOrders.length; i++)
        {
            studentOrders[i] = SaveStudentOrder.buildStudentOrder(i);
        }
        return studentOrders;
    }

    // проверка одной заявки
    public void checkOneOrder(StudentOrder so)
    {
        AnswerCityRegister cityRegister = checkCityRegister(so);
//        AnswerWedding answerWedding = checkWedding(so);
//        AnswerChildren answerChildren = checkChildren(so);
//        AnswerStudent answerStudent = checkStudent(so);

       // sendMail(so);
    }

    // проверка государственного реестра населения
    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder)
    {
        return cityRegisterValidator.checkCityRegister(studentOrder);
    }

    public AnswerWedding checkWedding(StudentOrder studentOrder)
    {
        return weddingValidator.checkWedding(studentOrder);
    }

    public AnswerChildren checkChildren(StudentOrder studentOrder)
    {
        return childrenValidator.checkChildren(studentOrder);
    }

    public AnswerStudent checkStudent(StudentOrder studentOrder)
    {
        return studentValidator.checkStudent(studentOrder);
    }

    public void sendMail(StudentOrder so)
    {
        mailSender.sendMail(so);
    }

}
