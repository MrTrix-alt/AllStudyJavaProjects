package edu.java.project.studentorder.validator.checkers;

import edu.java.project.studentorder.domain.CityRegisterCheckerResponse;
import edu.java.project.studentorder.domain.entity.AdultMan;
import edu.java.project.studentorder.domain.entity.Child;
import edu.java.project.studentorder.domain.entity.Person;
import edu.java.project.studentorder.exceptions.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker
{
    private static final String PASSPORT_SERIES1 = "1000";
    private static final String PASSPORT_SERIES2 = "2000";
    private static final String NOT_PASSPORT_SERIES1 = "1001";
    private static final String NOT_PASSPORT_SERIES2 = "2001";
    private static final String ERROR_1 = "1002";
    private static final String ERROR_2 = "2002";


    public CityRegisterCheckerResponse checkPersonCityRegister(Person person)
            throws CityRegisterException
    {
        CityRegisterCheckerResponse result = new CityRegisterCheckerResponse();
        if (person instanceof AdultMan)
        {
            AdultMan adultMan = (AdultMan) person;
            String passportSeries = adultMan.getPassportSeries();
            if (passportSeries.equals(PASSPORT_SERIES1) || passportSeries.equals(PASSPORT_SERIES2))
            {
                result.setExisting(true);
                result.setTemporal(false);
            }
            if (passportSeries.equals(NOT_PASSPORT_SERIES1) || passportSeries.equals(NOT_PASSPORT_SERIES2))
            {
                result.setExisting(false);
            }
            if (passportSeries.equals(ERROR_1) || passportSeries.equals(ERROR_2))
            {
                throw new CityRegisterException("Fake ERROR " + passportSeries);
            }
        }

        if (person instanceof Child)
        {
            result.setExisting(true);
            result.setTemporal(true);
        }
        System.out.println(result);
        return result;
    }
}
