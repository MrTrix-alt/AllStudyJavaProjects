package unit.test.learning.cartesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CarDocumentationWithFirstConstructorTest
{
    private CarDocumentation carDocumentation;

    @BeforeEach
    void createCar()
    {
        carDocumentation = new CarDocumentation("BMW", "X5", 3500000, 2020);
    }


    @Test
    void testGetCarCompanyMethod()
    {
        assertEquals("BMW", carDocumentation.getNameCompany());
    }

    @Test
    void testGetCarModelMethod()
    {
        assertEquals("X5", carDocumentation.getCarModel());
    }

    @Test
    void testGetCarPriceMethod()
    {
        assertEquals(3500000, carDocumentation.getPrice());
    }

    @Test
    void testSetCarPriceMethod()
    {
        carDocumentation.setPrice(3000000);
        assertEquals(3000000, carDocumentation.getPrice());
    }

    @Test
    void getYearMethod()
    {
        assertEquals(2020, carDocumentation.getYear());
    }

    @Test
    void getOwnerMethod()
    {
        carDocumentation.setOwner("Jim Gordon");
        assertEquals("Jim Gordon", carDocumentation.getOwner());
    }

    @Test
    void setOwnerMethod()
    {
        carDocumentation.setOwner("Andrej Volkov");
        assertEquals("Andrej Volkov", carDocumentation.getOwner());
    }

    @Test
    void setOwnerIfEmptyMethodThirdCase()
    {
        carDocumentation.setOwner("");
        assertNull(carDocumentation.getOwner());
    }

    @Test
    void getOwnerListMethod()
    {
        carDocumentation.setOwner("Andrej Volkov");
        assertArrayEquals(new String[] {"Andrej Volkov"},
                carDocumentation.getOwnerList().toArray());
    }

    @Test
    void showOwnersInfoMethod()
    {
        String consoleOutput = null;
        PrintStream originalOut = System.out;
        try
        {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(100);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            carDocumentation.showOwnersInfo();
            capture.flush();
            consoleOutput = outputStream.toString();
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals("Список владельцев машины: \r\n", consoleOutput);
    }
}