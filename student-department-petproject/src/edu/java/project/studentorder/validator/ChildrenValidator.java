package edu.java.project.studentorder.validator;

import edu.java.project.studentorder.domain.answer.AnswerChildren;
import edu.java.project.studentorder.domain.StudentOrder;

public class ChildrenValidator
{
    public AnswerChildren checkChildren(StudentOrder studentOrder)
    {
        System.out.println("Children Check");
        return new AnswerChildren();
    }
}
