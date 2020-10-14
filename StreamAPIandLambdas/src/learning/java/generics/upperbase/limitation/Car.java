package learning.java.generics.upperbase.limitation;

public class Car implements PayAbility
{
    private int price;

    public Car(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    @Override
    public boolean isPayAbility()
    {
        return price <= 3000000;
    }
}
