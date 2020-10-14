package unit.test.learning.base.calculator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class CalculatorJUnit5Test
{
    private Calculator calculator;

    @BeforeEach
    void setup()
    {
        calculator = new Calculator();
    }

    @Nested
    class SumTest
    {

        @Test
        @DisplayName("1 + 1 = 2")
        void addsTwoNumbers() {
            Calculator calculator = new Calculator();
            assertEquals(2, calculator.sum(1, 1), "1 + 1 should equal 2");
        }

        @ParameterizedTest(name = "{0} + {1} = {2}")
        @CsvSource({
                "0,    1,   1",
                "1,    2,   3",
                "49,  51, 100",
                "1,  100, 101"
        })
        void add(int first, int second, int expectedResult) {
            Calculator calculator = new Calculator();
            assertEquals(expectedResult, calculator.sum(first, second),
                    () -> first + " + " + second + " should equal " + expectedResult);
        }

        @Test
        void sum_TwoZero_ResultZero()
        {
            assertEquals(0,calculator.sum(0, 0));
        }

        @Test
        void sum_TwoPositiveNumbers_ResultPositive()
        {
            assertEquals(3,calculator.sum(1, 2));
        }

        @Test
        void sum_TwoNegativeNumbers_ResultNegative()
        {
            assertEquals(-3, calculator.sum(-1, -2));
        }

        @ParameterizedTest
        // @ValueSource(ints = {1, 2, 3}) // когда необходимо передать один параметр (int x)
        @CsvSource({"1, 2", "3, 4", "2, -1"}) // когда известны параметры и необходимо передать несколько параметров
        // (int x, int y)
        // @MethodSource("intProvider") когда параметры неизвестны, используем метод, который предоставит эти параметры
        void sum_MultipleParameters_ResultPositive(int x, int y)
        {
            assertTrue(calculator.sum(x, y) > 0);
        }

        Stream<Arguments> intProvider()
        {
            return Stream.of(Arguments.of(100, 200), Arguments.of(5, 6));
        }



        @Test
        void sum_Negative_Positive_Numbers_ResultPositive()
        {
            assertEquals(1, calculator.sum(-1, 2));
        }

        @Test
        void sum_Positive_Negative_Numbers_ResultNegative()
        {
            assertEquals(-1, calculator.sum(1, -2));
        }

        @TestFactory
        Stream<DynamicTest> dynamicTests()
        {
            return  Stream.generate(Math::random)
                    .limit(100)
                    .mapToInt(j -> (int) (j * 100))
                    .mapToObj(i -> dynamicTest("testing sum operation for values " + i,
                            () -> assertTrue(calculator.sum(i, i + 1) > 0)));
        }


        @TestFactory
        Stream<DynamicTest> dynamicTests2()
        {
            return  Stream.generate(Math::random)
                    .limit(100)
                    .mapToInt(j -> (int) (j * 100))
                    .mapToObj(i -> dynamicTest("testing sum operation for values " + i,
                            () -> assertTrue(calculator.sum(-i, i + 1) > 0)));
        }

        @TestFactory
        Stream<DynamicTest> dynamicTests3()
        {
            return  Stream.generate(Math::random)
                    .limit(100)
                    .mapToInt(j -> (int) (j * 100))
                    .mapToObj(i -> dynamicTest("testing sum operation for values " + i,
                            () -> assertTrue(calculator.sum(-i - 1, i) < 0)));
        }

        @TestFactory
        Stream<DynamicTest> dynamicTests4()
        {
            return  Stream.generate(Math::random)
                    .limit(100)
                    .mapToInt(j -> (int) (j * 100))
                    .mapToObj(i -> dynamicTest("testing sum operation for values " + i,
                            () -> assertTrue(calculator.sum(-i, -i) < 0 || calculator.sum(-i, -i) == 0)));
        }

        @TestFactory
        Stream<DynamicTest> dynamicTests5()
        {
            return  Stream.generate(Math::random)
                    .limit(100)
                    .mapToInt(j -> (int) (j * 100))
                    .mapToObj(i -> dynamicTest("testing sum operation for values " + i,
                            () -> assertTrue(calculator.sum(-i, i) == 0)));
        }


    }

    @Nested
    class SubtractTest
    {

        @Test
        void subtract_TwoPositiveNumbers_ResultPositive()
        {
            assertEquals(1, calculator.subtract(2, 1));
        }

        @Test
        void subtract_TwoPositiveNumbers_ResultNegative()
        {
            assertEquals(-1, calculator.subtract(1, 2));
        }

        @Test
        void subtract_TwoNegativeNumbers_ResultPositive()
        {
            assertEquals(1, calculator.subtract(-1, -2));
        }

        @Test
        void subtract_TwoNegativeNumbers_ResultNegative()
        {
            assertEquals(-1, calculator.subtract(-2, -1));
        }

        @Test
        void subtract_NegativePositiveNumbers_ResultNegative()
        {
            assertEquals(-2, calculator.subtract(-1, 1));
        }

        @Test
        void subtract_PositiveNegativeNumbers_ResultPositive()
        {
            assertEquals(3, calculator.subtract(1, -2));
        }

        @TestFactory
        Stream<DynamicTest> dynamicTests()
        {
            return  Stream.generate(Math::random)
                    .limit(100)
                    .mapToInt(j -> (int) (j * 100))
                    .mapToObj(i -> dynamicTest("testing sum operation for values " + i,
                            () -> assertTrue(calculator.subtract(i + 1, i) > 0)));
        }
    }

    @Nested
    class DivideTest
    {

        @Test
        void divide_TwoPositiveNumbers_ResultPositive()
        {
            assertEquals(2, calculator.divide(2, 1));
        }

        @Test
        void divide_TwoNegativeNumbers_ResultPositive()
        {
            assertEquals(2, calculator.divide(-2, -1));
        }

        @Test
        void divide_NegativePositive_ResultNegative()
        {
            assertEquals(-2, calculator.divide(-2, 1));
        }

        @Test
        void divide_PositiveNegative_ResultNegative()
        {
            assertEquals(-2, calculator.divide(2, -1));
        }

        @Test
        void divide_PositiveNumber_ByZero_Throw()
        {
            Exception ex = assertThrows(ArithmeticException.class, () -> calculator.divide(1,0));
            assertEquals(ex.getMessage(), "/ by zero", "invalid error message received");
        }

        @Test
        void divide_NegativeNumber_ByZero_Throw()
        {
            Exception ex = assertThrows(ArithmeticException.class, () -> calculator.divide(-1,0));
            assertEquals(ex.getMessage(), "/ by zero", "invalid error message received");
        }

        @Test
        void divide_ZeroByZero_Throw()
        {
            Exception ex = assertThrows(ArithmeticException.class, () -> calculator.divide(0,0));
            assertEquals(ex.getMessage(), "/ by zero", "invalid error message received");
        }

        @Test
        void divide_ZeroByPositiveNumber_ResultZero()
        {
            assertEquals(0, calculator.divide(0,1));
        }

        @Test
        void divide_ZeroByNegativeNumber_ResultZero()
        {
            assertEquals(0, calculator.divide(0,-1));
        }

    }

    @Nested
    class MultiplyTest
    {

        @Test
        void multiply_TwoPositiveNumbers_ResultPositive()
        {
            assertEquals(2, calculator.multiply(1, 2));
        }

        @Test
        void multiply_TwoNegativeNumbers_ResultPositive()
        {
            assertEquals(2, calculator.multiply(-1, -2));
        }

        @Test
        void multiply_Positive_Negative_Numbers_ResultPositive()
        {
            assertEquals(-2, calculator.multiply(1, -2));
        }

        @Test
        void multiply_Negative_Positive_Numbers_ResultPositive()
        {
            assertEquals(-2, calculator.multiply(-1, 2));
        }

        @Test
        void multiply_Negative_On_Zero_ResultZero()
        {
            assertEquals(0, calculator.multiply(-1, 0));
        }

        @Test
        void multiply_Positive_On_Zero_ResultZero()
        {
            assertEquals(0, calculator.multiply(1, 0));
        }

        @Test
        void multiply_Zero_On_Zero_ResultZero()
        {
            assertEquals(0, calculator.multiply(0, 0));
        }

        @TestFactory
        @DisplayName("multiplyPositiveNumber")
        Stream<DynamicTest> dynamicTests()
        {
            return  Stream.generate(Math::random)
                    .limit(100)
                    .mapToInt(j -> (int) (j * 100))
                    .mapToObj(i -> dynamicTest("testing multiply operation for values " + i,
                            () -> assertTrue(calculator.multiply(i, i + 1) >= 0
                                    && calculator.multiply(i, i) >= 0)));
        }

        @TestFactory
        @DisplayName("multiplyNegativeNumbers")
        Stream<DynamicTest> dynamicTests1()
        {
            return  Stream.generate(Math::random)
                    .limit(100)
                    .mapToInt(j -> (int) (j * 100))
                    .mapToObj(i -> dynamicTest("testing multiply operation for values " + i,
                            () -> assertTrue(calculator.multiply(-i, -i + 1) >= 0
                                    && calculator.multiply(-i, -i) >= 0)));
        }


    }



}