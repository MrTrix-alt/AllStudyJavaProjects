package edu.java.project.studentorder.validator.checkers;


import edu.java.project.studentorder.domain.CityRegisterCheckerResponse;
import edu.java.project.studentorder.domain.entity.Person;
import edu.java.project.studentorder.exceptions.CityRegisterException;

public interface CityRegisterChecker
{
    CityRegisterCheckerResponse checkPersonCityRegister(Person person) throws CityRegisterException;
}
