package unit.test.learning.cartesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import unit.test.learning.cartesting.Car;
import unit.test.learning.cartesting.CarDocumentation;
import unit.test.learning.cartesting.Transmission;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car car;
    private CarDocumentation carDocumentation;

    @BeforeEach
    void prepareData()
    {
        carDocumentation = new CarDocumentation("Toyota", "Camry",
                4500000, 2019, "Maxim Urvanov");
        car = new Car(carDocumentation, 200, 250, Transmission.AUTO);
    }

    @Test
    void getCarDocumentation()
    {
        assertEquals(carDocumentation, car.getCarDocumentation());
    }

    @Test
    void getCapacity()
    {
        assertEquals(200, car.getCapacity());
    }

    @Test
    void setCapacity()
    {
        car.setCapacity(230);
        assertEquals(230, car.getCapacity());
    }

    @Test
    void getMaxSpeed()
    {
        assertEquals(250, car.getMaxSpeed());
    }

    @Test
    void setMaxSpeed()
    {
        car.setMaxSpeed(280);
        assertEquals(280, car.getMaxSpeed());
    }

    @Test
    void getTransmission()
    {
        assertEquals(Transmission.AUTO, car.getTransmission());
    }

    @Test
    void setTransmission()
    {
        car.setTransmission(Transmission.MECHANICAL);
        assertEquals(Transmission.MECHANICAL, car.getTransmission());
    }
}