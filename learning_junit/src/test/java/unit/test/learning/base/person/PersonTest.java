package unit.test.learning.base.person;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest
{
    private Person person;

    @BeforeEach
    void setUp()
    {
        person = new Person("Timur", "Abubakirov");
    }

    @Test
    void getFullName()
    {
        assertAll("person",
                () -> assertEquals("Timur", person.getFirstName()),
                () -> assertEquals("Abubakirov", person.getLastName()));
    }

    @Test
    void setFullName()
    {
        person.setFirstName("Felix");
        person.setLastName("Ivanov");
        assertAll("person",
                () -> assertEquals("Felix", person.getFirstName()),
                () -> assertEquals("Ivanov", person.getLastName()));

    }

    @Test
    void setFullNameIfEmpty()
    {
        person.setFirstName("");
        person.setLastName("");
        assertAll("person",
                () -> assertEquals("", person.getFirstName()),
                () -> assertEquals("", person.getLastName()));
    }

    @AfterEach
    void tearDown()
    {
        System.out.println("Passed");
    }
}