package edu.java.project.studentorder.validator;

import edu.java.project.studentorder.domain.answer.AnswerCityRegister;
import edu.java.project.studentorder.domain.CityRegisterCheckerResponse;
import edu.java.project.studentorder.domain.StudentOrder;
import edu.java.project.studentorder.exceptions.CityRegisterException;
import edu.java.project.studentorder.validator.checkers.CityRegisterChecker;
import edu.java.project.studentorder.validator.checkers.FakeCityRegisterChecker;

public class CityRegisterValidator
{
    private String hostName;
    private int port;
    private String login;
    private String password;

    private CityRegisterChecker cityRegisterChecker;

    public CityRegisterValidator()
    {
        cityRegisterChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder studentOrder)
    {
        System.out.println("CityRegister is running:");

        // Обработка методов, возвращающих Person
        try
        {
            CityRegisterCheckerResponse husbandAns = cityRegisterChecker.checkPersonCityRegister(studentOrder.getHusband());
            CityRegisterCheckerResponse wifeAns = cityRegisterChecker.checkPersonCityRegister(studentOrder.getWife());
            CityRegisterCheckerResponse child = cityRegisterChecker.checkPersonCityRegister(studentOrder.getChild());
        }
        catch (CityRegisterException e)
        {
            e.printStackTrace(System.out);
        }

        AnswerCityRegister answerCityRegister = new AnswerCityRegister();

        return answerCityRegister;
    }
}
