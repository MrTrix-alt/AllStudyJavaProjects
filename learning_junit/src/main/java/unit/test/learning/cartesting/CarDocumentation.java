package unit.test.learning.cartesting;

import java.util.ArrayList;
import java.util.List;

public class CarDocumentation
{
    private String nameCompany;
    private String carModel;
    private int price;
    private int year;
    private String owner;
    private List<String> owners = new ArrayList<>();

    public CarDocumentation(String nameCompany, String carModel, int price, int year)
    {
        this.nameCompany = nameCompany;
        this.carModel = carModel;
        this.price = price;
        this.year = year;
    }

    public CarDocumentation(String nameCompany, String carModel, int price, int year, String owner)
    {
        this.nameCompany = nameCompany;
        this.carModel = carModel;
        this.price = price;
        this.year = year;
        this.owner = owner;

        owners.add(owner);
    }

    public List<String> getOwnerList() {
        return owners;
    }

    public String getNameCompany()
    {
        return nameCompany;
    }

    public String getCarModel()
    {
        return carModel;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getYear()
    {
        return year;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        if (!owner.isEmpty())
        {
            this.owner = owner;
            owners.add(owner);
        } else {
            System.out.println("Введите имя нового Владельца еще раз!");
        }
    }

    public void showOwnersInfo()
    {
        System.out.println("Список владельцев машины: ");
        if (owners != null && !owners.isEmpty())
        {
            for (String owner : owners)
            {
                if (!owner.equalsIgnoreCase(""))
                {
                    System.out.println(owner);
                } else {
                    System.out.println("Список владельцев машины пуст.");
                }
            }
        }
    }




}
