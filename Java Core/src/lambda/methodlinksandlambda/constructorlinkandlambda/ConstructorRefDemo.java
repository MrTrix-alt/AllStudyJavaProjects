package lambda.methodlinksandlambda.constructorlinkandlambda;

public class ConstructorRefDemo {
    public static void main(String[] args) {

        /*
            Создаем ссылку на конструктор DemoClass.
            Метод func() из интерфейса Function принимает аргумент,
            поэтому оператор new обращается к параметизированному
            конструктору класс DemoClass, не обращаясь к конструктор по умолчанию.
         */
        Function<Integer> demoClassCons = DemoClass::new;
        DemoClass<Integer> demoClass = demoClassCons.func(231);

        System.out.println("Значение val в объекте demoClass равно: " + demoClass.getVal());
    }
}
