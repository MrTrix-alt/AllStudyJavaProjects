package unit.test.learning.cartesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unit.test.learning.cartesting.CarDocumentation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CarDocumentationTest
{
    private CarDocumentation carDocumentation;

    @BeforeEach
    void createCar()
    {
        carDocumentation = new CarDocumentation("Toyota", "Camry",
                4500000, 2019, "Maxim Urvanov");
    }

    @Test
    void testGetCarCompanyMethod()
    {
        assertEquals("Toyota", carDocumentation.getNameCompany());
    }

    @Test
    void testGetCarModelMethod()
    {
        assertEquals("Camry", carDocumentation.getCarModel());
    }

    @Test
    void testGetCarPriceMethod()
    {
        assertEquals(4500000, carDocumentation.getPrice());
    }

    @Test
    void testSetCarPriceMethod()
    {
        carDocumentation.setPrice(3500000);
        assertEquals(3500000, carDocumentation.getPrice());
    }

    @Test
    void getYearMethod()
    {
        assertEquals(2019, carDocumentation.getYear());
    }

    @Test
    void getOwnerMethod()
    {
        assertEquals("Maxim Urvanov", carDocumentation.getOwner());
    }

    @Test
    void setOwnerMethod()
    {
        carDocumentation.setOwner("Andrej Volkov");
        assertEquals("Andrej Volkov", carDocumentation.getOwner());
    }

    @Test
    void setOwnerIfEmptyMethod()
    {
        CarDocumentation carDocumentation = new CarDocumentation("Toyota", "Camry",
                4500000, 2019, "");
        carDocumentation.setOwner("Andrej Volkov");
        assertEquals("Andrej Volkov", carDocumentation.getOwner());
    }

    @Test
    void setOwnerIfEmptyMethodThirdCase()
    {
        carDocumentation.setOwner("");
        assertEquals("Maxim Urvanov", carDocumentation.getOwner());
    }

    @Test
    void getOwnerListMethod()
    {
        carDocumentation.setOwner("Andrej Volkov");
        assertArrayEquals(new String[] {"Maxim Urvanov", "Andrej Volkov"},
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
        assertEquals("Список владельцев машины: \r\n" +
                "Maxim Urvanov\r\n", consoleOutput);
    }

    @Test
    void showOwnersIfEmptyInfoMethod()
    {
        String consoleOutput = null;
        PrintStream originalOut = System.out;
        CarDocumentation carDocumentation = new CarDocumentation("Toyota", "Camry",
                4500000, 2019, "");
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
        assertEquals("Список владельцев машины: \r\n" +
                "Список владельцев машины пуст.\r\n", consoleOutput);
    }


}