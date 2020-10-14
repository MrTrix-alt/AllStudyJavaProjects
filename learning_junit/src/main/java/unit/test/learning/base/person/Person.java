package unit.test.learning.base.person;

public class Person
{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        if (!this.firstName.isEmpty())
        {
            this.firstName = firstName;

        } else {
            System.out.println("Введите имя человека еще раз!");
        }
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        if (!this.lastName.isEmpty())
        {
            this.lastName = lastName;

        } else {
            System.out.println("Введите фамилию человека еще раз!");
        }
    }
}
