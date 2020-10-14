package learning.java.generics.base;

public class Car
{
    private String id;
    private int sum;

    <T>Car(T id, int sum)
    {
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId()
    {
        return id;
    }

    public int getSum()
    {
        return sum;
    }

    public void setSum(int sum)
    {
        this.sum = sum;
    }
}
