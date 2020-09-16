package edu.java.project.studentorder.validator;

import edu.java.project.studentorder.domain.answer.AnswerStudent;
import edu.java.project.studentorder.domain.StudentOrder;

public class StudentValidator
{
    public AnswerStudent checkStudent(StudentOrder studentOrder)
    {
        System.out.println("Student Check");
        return new AnswerStudent();
    }
}
