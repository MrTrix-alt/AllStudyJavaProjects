package learning.java.streamapi.upperbase.operations.minmax;

import java.util.Comparator;

public class Car
{
    private String name;
    private int price;

    public Car(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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
    public String toString() {
        return "Car {" +
                "name = '" + name + '\'' +
                ", price = " + price +
                '}';
    }

    public static class CarComparator implements Comparator<Car>
    {

        @Override
        public int compare(Car o1, Car o2) {
            if (o1.getPrice() > o2.getPrice())
            {
                return 1;
            } else if (o1.getPrice() == o2.getPrice()) {
                return 0;
            }
            return -1;
        }
    }
}
