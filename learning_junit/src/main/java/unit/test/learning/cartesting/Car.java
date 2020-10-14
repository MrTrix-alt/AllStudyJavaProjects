package unit.test.learning.cartesting;

public class Car<T>
{
    private CarDocumentation carDocumentation;

    private int capacity;
    private int maxSpeed;
    private Transmission transmission;


    public Car(CarDocumentation carDocumentation, int capacity,
               int maxSpeed, Transmission transmission)
    {
        this.carDocumentation = carDocumentation;
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
    }

    public CarDocumentation getCarDocumentation()
    {
        return carDocumentation;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public Transmission getTransmission()
    {
        return transmission;
    }

    public void setTransmission(Transmission transmission)
    {
        this.transmission = transmission;
    }
}
