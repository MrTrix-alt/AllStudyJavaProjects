package lessonSix;

public class TaskOne {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TaskOne.class);

    public static void main(String[] args) {
        /*
         Написать метод, которому в качестве аргумента передается
         не пустой одномерный целочисленный массив. Метод должен вернуть
         новый массив, который получен путем вытаскивания из исходного
         массива элементов, идущих после последней четверки.
         Входной массив должен содержать хотя бы одну четверку,
         иначе в методе необходимо выбросить RuntimeException.
         Написать набор тестов для этого метода (по 3-4 варианта входных данных).
         Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
         */


        final int[] arr = process(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(arr);



    }

    public static int[] process(int[] arrIn) {
        int[] backArr = new int[2];
        if(arrIn.length == 0) {
            log.info("В массиве нет элементов");
            return arrIn;
        }
        for (int i = arrIn.length - 3; i >= 0 ; i--) {
            if(arrIn[i] == 4) {
                System.arraycopy(arrIn, (i+1), backArr,0,2);
                return backArr;
            }
        }
        throw new RuntimeException("В массиве нет ни одной 4-ки после которой были бы числа");
    }
}
