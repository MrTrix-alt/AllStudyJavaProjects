package lambda.exceptionsandlambda;

public class EmptyArrayException extends Exception {
    private int number;

    EmptyArrayException() {
        super("Array is empty!");
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
