package lambda.methodlinksandlambda.methodsofobject.classandlambda;

public class Temperature {
    private int temp;

    // Храним в этом в классе температуру за день
    Temperature(int temp) {
        this.temp = temp;
    }
    // Возвращаем логическое значение true, если вызывающий объект
    // типа Temperature имеет такую температуру, как и у объекта tempTwo
    boolean sameTemp(Temperature tempTwo) {
        return this.temp == tempTwo.temp;
    }

}
