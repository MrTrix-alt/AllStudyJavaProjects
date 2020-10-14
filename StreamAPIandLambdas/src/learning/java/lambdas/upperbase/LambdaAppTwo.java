package learning.java.lambdas.upperbase;

public class LambdaAppTwo
{
    public static void main(String[] args)
    {
        // Лямбды как параметры методов:
        Expression func = (n) -> n % 2 == 0;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int quantityEvenNumber = checkNumberInArray(arr, func);
        System.out.println("Количество четных элементов в массиве arr: " + quantityEvenNumber);

        // Лямбда: Ссылки на метод как параметры методов
        // 1) Проверка положительности элементов в массиве:
        Expression func1 = ExpressionHelper::isPositive;
        int[] arr1 = { -1, 2, 0, -3, 4, -5, 0, 6, -7, 8, -9, 10, 0, -11, 12 };
        int quantityPositiveNumber = checkNumberInArray(arr1, func1);
        System.out.println("Количество положительных элементов массиве arr1: " + quantityPositiveNumber);
        // 2) Проверка чётности элементов в массиве:
        Expression func2 = ExpressionHelper::isEven;
        int quantityEvenNumber1 = checkNumberInArray(arr1, func2);
        System.out.println("Количество чётных элементов в массиве arr1: " + quantityEvenNumber1);
        // 3) Проверка массива на наличие элементов, равных нулю:
        // Использование объекта в случае нестатического метода.
        ExpressionHelper exprHelper = new ExpressionHelper();
        Expression func3 = exprHelper::isZero;
        int quantityZeroInArray = checkNumberInArray(arr1, func3);
        System.out.println("Количество нулей в массиве arr1: " + quantityZeroInArray);

        // Ссылки на конструкторы:
        CreaterUser createrUser = User::new;
        User user = createrUser.createUser("Timur", 22);
        User user1 = createrUser.createUser("Maxim", 14);
        User user2 = createrUser.createUser("Maxim", 18);

        User[] usersArr = { user, user1, user2 };
        int quantityAdult = checkUserAge(usersArr);
        System.out.println("Количество совершеннолетних в массиве usersArr: " + quantityAdult);

        // Лямбды как результат методов:
        Operation func4 = action(1);
        int a = func4.execute(6, 5);
        System.out.println("Результат выполнения метода action: "+ a);


    }

    private static int checkNumberInArray(int[] numberArr, Expression expression)
    {
        int count = 0;
        boolean check;
        for(int i : numberArr)
        {
            check = expression.isEquals(i);
            if (check)
            {
                count++;
            }
        }
        return count;
    }

    private static int checkUserAge(User[] users)
    {
       int count = 0;
       boolean isAdult;
       for(User user : users)
       {
           isAdult = user.checkAge();
           if (isAdult)
           {
               count++;
           }
       }
       return count;
    }

    private static Operation action(int number)
    {
        switch(number)
        {
            case 1:
                return (x, y) -> x + y;
            case 2:
                return (x, y) -> x - y;
            case 3:
                return (x, y) -> x * y;
            default:
                return (x,y) -> 0;
        }
    }
}
