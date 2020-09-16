package edu.java.project.studentorder.validator;

import edu.java.project.studentorder.domain.answer.AnswerWedding;
import edu.java.project.studentorder.domain.StudentOrder;

public class WeddingValidator
{
    public AnswerWedding checkWedding(StudentOrder studentOrder)
    {
        System.out.println("CheckWedding");
        return new AnswerWedding();
    }
}
