package learning.java.streamapi.upperbase.operations.sorted;

import java.util.Comparator;

public class Phone
{
    private String name;
    private String company;
    private int price;


    public Phone(String name, String company, int price)
    {
        this.name = name;
        this.company = company;
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

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    @Override
    public String toString()
    {
        return "Phone: " +
                "name: '" + name + '\'' +
                ", price: " + price ;
    }

    static class PhoneComparator implements Comparator<Phone>
    {

        @Override
        public int compare(Phone a, Phone b) {
            return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
        }
    }
}
