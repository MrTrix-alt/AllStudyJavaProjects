package unit.test.learning.cartesting;

public class CarDemo
{
    public static void main(String[] args)
    {
        CarDocumentation carDocumentation = new CarDocumentation("Toyota", "Camry",
                4500000, 2020);
        carDocumentation.setOwner("Igor");
        Car car = new Car(carDocumentation, 240, 320, Transmission.AUTO);
        car.getCarDocumentation().showOwnersInfo();



    }
}
