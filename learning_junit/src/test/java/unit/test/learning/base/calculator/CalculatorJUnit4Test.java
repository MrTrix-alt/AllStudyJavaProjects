package unit.test.learning.base.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculatorJUnit4Test
{
    private Calculator calculator;

    @Before
    public void setup()
    {
        calculator = new Calculator();
    }

    @Test
    public void sum_TwoPositiveNumbers_ResultPositive()
    {
        assertEquals(3,calculator.sum(1, 2));
    }

    @Test
    public void sum_TwoNegativeNumbers_ResultNegative()
    {
        assertEquals(-3, calculator.sum(-1, -2));
    }

    @Test
    public void sum_Negative_Positive_Numbers_ResultPositive()
    {
        assertEquals(1, calculator.sum(-1, 2));
    }

    @Test
    public void sum_Positive_Negative_Numbers_ResultNegative()
    {
        assertEquals(-1, calculator.sum(1, -2));
    }

    @Test
    public void subtract_TwoPositiveNumbers_ResultPositive()
    {
        assertEquals(1, calculator.subtract(2, 1));
    }

    @Test
    public void subtract_TwoPositiveNumbers_ResultNegative()
    {
        assertEquals(-1, calculator.subtract(1, 2));
    }

    @Test
    public void subtract_TwoNegativeNumbers_ResultPositive()
    {
        assertEquals(1, calculator.subtract(-1, -2));
    }

    @Test
    public void subtract_TwoNegativeNumbers_ResultNegative()
    {
        assertEquals(-1, calculator.subtract(-2, -1));
    }

    @Test
    public void subtract_NegativePositiveNumbers_ResultNegative()
    {
        assertEquals(-2, calculator.subtract(-1, 1));
    }

    @Test
    public void subtract_PositiveNegativeNumbers_ResultPositive()
    {
        assertEquals(3, calculator.subtract(1, -2));
    }

    @Test
    public void divide_TwoPositiveNumbers_ResultPositive()
    {
        assertEquals(2, calculator.divide(2, 1));
    }

    @Test
    public void divide_TwoNegativeNumbers_ResultPositive()
    {
        assertEquals(2, calculator.divide(-2, -1));
    }

    @Test
    public void divide_NegativePositive_ResultNegative()
    {
        assertEquals(-2, calculator.divide(-2, 1));
    }

    @Test
    public void divide_PositiveNegative_ResultNegative()
    {
        assertEquals(-2, calculator.divide(2, -1));
    }

    @Test
    public void divide_PositiveNumber_ByZero_Throw()
    {
        try
        {
            calculator.divide(1, 0);
            fail("Divide operation doesn't throw exception");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(expected = ArithmeticException.class)
    public void divide_NegativeNumber_ByZero_Throw()
    {
        assertEquals(0, calculator.divide(-1,0));
    }

    @Test(expected = ArithmeticException.class)
    public void divide_ZeroByZero_Throw()
    {
        assertEquals(0, calculator.divide(0,0));
    }

    @Test
    public void divide_ZeroByPositiveNumber_ResultZero()
    {
        assertEquals(0, calculator.divide(0,1));
    }

    @Test
    public void divide_ZeroByNegativeNumber_ResultZero()
    {
        assertEquals(0, calculator.divide(0,-1));
    }

    @Test
    public void multiply_TwoPositiveNumbers_ResultPositive()
    {
        assertEquals(2, calculator.multiply(1, 2));
    }

    @Test
    public void multiply_TwoNegativeNumbers_ResultPositive()
    {
        assertEquals(2, calculator.multiply(-1, -2));
    }

    @Test
    public void multiply_Positive_Negative_Numbers_ResultPositive()
    {
        assertEquals(-2, calculator.multiply(1, -2));
    }

    @Test
    public void multiply_Negative_Positive_Numbers_ResultPositive()
    {
        assertEquals(-2, calculator.multiply(-1, 2));
    }

    @Test
    public void multiply_Negative_On_Zero_ResultZero()
    {
        assertEquals(0, calculator.multiply(-1, 0));
    }

    @Test
    public void multiply_Positive_On_Zero_ResultZero()
    {
        assertEquals(0, calculator.multiply(1, 0));
    }

    @Test
    public void multiply_Zero_On_Zero_ResultZero()
    {
        assertEquals(0, calculator.multiply(0, 0));
    }
}