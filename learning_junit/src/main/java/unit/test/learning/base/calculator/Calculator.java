package unit.test.learning.base.calculator;

public class Calculator
{

    public long sum(int x, int y)
    {
        System.out.println("Adding values: " + x + " + " + y);
        return (long) x + y;
    }

    public long subtract(int x, int y)
    {
        System.out.println("Subtracting values: " + x + " - " + y);
        return (long) x - y;
    }

    public int divide(int x, int y)
    {
        System.out.println("Dividing values: " + x + " / " + y);
        if (y == 0)
        {
            System.out.println("На НОЛЬ деление недопустимо!" +
                    " Введите числа заново!");
        }
        return x / y;
    }

    public long multiply(int x, int y)
    {
        System.out.println("Multiplying values: " + x + " * " + y);
        return (long) x * y;
    }


}

