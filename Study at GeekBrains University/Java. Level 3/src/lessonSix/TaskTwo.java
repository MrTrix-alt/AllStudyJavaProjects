package lessonSix;

public class TaskTwo {
    public static void main(String[] args) {
        /*
          Написать метод, который проверяет состав массива из чисел 1 и 4.
          Если в нем нет хоть одной четверки или единицы, то метод вернет false;
          Написать набор тестов для этого метода (по 3-4 варианта входных данных).
         */
        boolean result = process(new int[]{1, 1, 1, 1, 1});
        System.out.println(result);
    }

    public static boolean process(int[] arrIn) {
        boolean one = false;
        boolean four = false;
        for (int i : arrIn) {
            if(i != 1 && i!=4) throw new RuntimeException("invalid value");
            if(i == 1) one = true;
            if(i == 4) four = true;
        }
        return one && four;
    }
}
