package learning.java.generics.base;

public class Account<T> {
    private T id;

    public Account(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public <T> void print(T[] arr)
    {
        for (T t : arr)
        {
            System.out.println(t);
        }
    }
}
