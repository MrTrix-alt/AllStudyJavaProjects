package learning.java.generics.base;

public class Acc implements Accountable<String>
{
    private String id;

    public Acc(String id)
    {
        this.id = id;
    }

    @Override
    public String getId()
    {
        return id;
    }

    void print()
    {
        System.out.println(id);
    }
}
