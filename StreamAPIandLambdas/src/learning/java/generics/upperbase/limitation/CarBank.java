package learning.java.generics.upperbase.limitation;

import learning.java.streamapi.upperbase.operations.mainoperations.Phone;

public class CarBank<T extends Car & PayAbility>
{
    private T car;
    private float rate;

    public CarBank(T car)
    {
        this.car = car;
    }


    public float getCreditSum()
    {
        if (car.isPayAbility())
            return ((Car) car).getPrice() * rate + ((Car) car).getPrice();
        System.out.println("Кредит не одобрен!");
        return 0;
    }
    public float getRate()
    {
        return rate;
    }

    public void setRate(float rate)
    {
        this.rate = rate;
    }


}
